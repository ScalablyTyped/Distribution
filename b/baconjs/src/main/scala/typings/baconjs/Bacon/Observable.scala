package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Observable
  * @description A superclass for [EventStream]{@link Bacon.EventStream} and [Property]{@link Bacon.Property}.
  * */
@js.native
trait Observable[E, A] extends js.Object {
  /**
    * @method
    * @description Creates a [Property]{@link Bacon.Property} that indicates whether Observable is awaiting `otherObservable`, i.e. has produced a value after the latest value from `otherObservable`.
    * @param {Observable<E, B>} otherObservable
    * @returns {Property<E, boolean>}
    * @example
    * {
    	 *     // This is handy for keeping track whether we are currently awaiting an AJAX response:
    	 *     let ajaxRequest = <Bacon.Observable<Error, JQueryXHR>>{},
    	 *         ajaxResponse = <Bacon.Observable<Error, JQueryXHR>>{},
    	 *         showAjaxIndicator = ajaxRequest.awaiting(ajaxResponse);
    	 * }
    */
  def awaiting[B](otherObservable: Observable[E, B]): Property[E, Boolean] = js.native
  /**
    * @method
    * @description Throttles the [Observable]{@link Bacon.Observable} using a buffer so that at most one value event in `minimumInteval` is issued. Unlike [EventStream.throttle]{@link Bacon.EventStream#throttle} and [Property.throttle]{@link Bacon.Property#throttle}, it doesn't discard the excessive events but buffers them instead, outputting them with a rate of at most one value per `minimumInterval`.
    * @param {number} minimumInterval
    * @returns {EventStream<E, A>}
    */
  def bufferingThrottle(minimumInterval: Double): EventStream[E, A] = js.native
  /**
    * @callback Observable#combine~f
    * @param {A} a
    * @param {B} b
    * @returns {C}
    */
  /**
    * @method Observable#combine
    * @description Combines the latest values of the two [EventStream]{@link Bacon.EventStream}s or [Property]{@link Bacon.Property}s using a two-arg function `f`. The result is a Property.
    * @param {Property<E, B>} property2
    * @param {Observable#combine~f} f
    * @returns {Property<E, C>}
    */
  def combine[B, C](property2: Property[E, B], f: js.Function2[/* a */ A, /* b */ B, C]): Property[E, C] = js.native
  /**
    * @method
    * @description Decodes input [Observable]{@link Bacon.Observable} using the given `mapping`. Is a bit like a switch-case or the decode function in Oracle SQL. The return value of `decode` is always a [Property]{@link Bacon.Property}.
    * @param {Object} mapping
    * @returns {Property<E, B>}
    * @example
    * {
    	 *     let property = Bacon.fromArray([1, 2, 3]).toProperty(),
    	 *         who = Bacon.fromArray(["A", "B", "C"]).toProperty();
    	 *     // The following would map the value 1 into the string "mike" and the value 2 into the value of the `who` property:
    	 *     property.decode({1: "mike", 2: who});
    	 *     // You can compose static and dynamic data quite freely, as in:
    	 *     property.decode({1: {type: "mike"}, 2: {type: "other", whoThen: who}});
    	 * }
    */
  def decode[B](mapping: js.Object): Property[E, B] = js.native
  /**
    * @callback Observable#diff~f
    * @param {A} a
    * @param {B} b
    * @returns {B}
    */
  /**
    * @method Observable#diff
    * @description Returns a [Property]{@link Bacon.Property} that represents the result of a comparison `f` between the previous and current value of the [Observable]{@link Bacon.Observable}. For the initial value of the Observable, the previous value will be the given `start`.
    * @param {A} start
    * @param {Observable#diff~f} f
    * @returns {Property<E, B>}
    * @example
    * Bacon.sequentially(1, [1, 2, 3]).diff(0, (a, b) => Math.abs(b - a));
    */
  def diff[B](start: A, f: js.Function2[/* a */ A, /* b */ A, B]): Property[E, B] = js.native
  /**
    * @callback Observable#firstToPromise~promiseCtr
    * @param {A} value
    * @returns {Promise<A>}
    */
  /**
    * @method Observable#firstToPromise
    * @description Returns a Promise which will be resolved with the first event coming from an [Observable]{@link Bacon.Observable}. Like [Observable.toPromise]{@link Bacon.Observable#toPromise}, the global ES6 promise implementation will be used unless a promise constructor `promiseCtr` is given.
    * @param {Observable#firstToPromise~promiseCtr} [promiseCtr]
    * @returns {Promise<A>}
    */
  def firstToPromise(): js.Promise[A] = js.native
  def firstToPromise(promiseCtr: js.Function1[/* value */ A, js.Promise[A]]): js.Promise[A] = js.native
  /**
    * @callback Observable#flatMap~f
    * @param {A} value
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMap
    * @description For each element in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f`,  and collect events from each of the spawned streams into the result [EventStream]{@link Bacon.EventStream}. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. The result of [flatMap]{@link Bacon.Observable#flatMap} is always an EventStream. The "Function Construction rules" apply here. `flatMap` can be used conveniently with [Bacon.once]{@link Bacon.once} and [Bacon.never]{@link Bacon.never} for converting and filtering at the same time, including only some of the results.
    * @param {Observable#flatMap~f} f
    * @returns {EventStream<E, B>}
    * @example
    * // Converting strings to integers, skipping empty values:
    * Bacon.once("").flatMap(text => {
    *     return text != "" ? parseInt(text) : Bacon.never();
    * });
    */
  def flatMap[B](f: js.Function1[/* value */ A, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]): EventStream[E, B] = js.native
  /**
    * @callback Observable#flatMapConcat~f
    * @param {A} value
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMapConcat
    * @description For each element in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f`,  and collect events from each of the spawned streams into the result [EventStream]{@link Bacon.EventStream}, but limit the number of open spawned streams and buffers incoming events to 1. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. The result of `flatMapConcat` is always an EventStream.
    * @param {Observable#flatMapConcat~f} f
    * @returns {EventStream<E, B>}
    */
  def flatMapConcat[B](f: js.Function1[/* value */ A, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]): EventStream[E, B] = js.native
  /**
    * @callback Observable#flatMapError~f
    * @param {E} error
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMapError
    * @description For each [Error]{@link Bacon.Error} event in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f`,  and collect events from each of the spawned streams into the result [EventStream]{@link Bacon.EventStream}. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. The result of [flatMapError]{@link Bacon.Observable#flatMapError} is always an EventStream.
    * @param {Observable#flatMapError~f} f
    * @returns {EventStream<E, B>}
    */
  def flatMapError[B](f: js.Function1[/* error */ E, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]): EventStream[E, B] = js.native
  /**
    * @callback Observable#flatMapFirst~f
    * @param {A} value
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMapFirst
    * @description For each element in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f` only if the previously spawned stream has ended, and collect events from each of the spawned streams into the result [EventStream]{@link Bacon.EventStream}. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. The result of [flatMapFirst]{@link Bacon.Observable#flatMapFirst} is always an EventStream.
    * @param {Observable#flatMapFirst~f} f
    * @returns {EventStream<E, B>}
    */
  def flatMapFirst[B](f: js.Function1[/* value */ A, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]): EventStream[E, B] = js.native
  /**
    * @callback Observable#flatMapLatest~f
    * @param {A} value
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMapLatest
    * @description For each element in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f`,  but instead of including events from all spawned streams, only includes them from the latest spawned stream into the result [EventStream]{@link Bacon.EventStream}. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. The result of [flatMapLatest]{@link Bacon.Observable#flatMapLatest} is always an EventStream.
    * @param {Observable#flatMapLatest~f} f
    * @returns {EventStream<E, B>}
    */
  def flatMapLatest[B](f: js.Function1[/* value */ A, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]): EventStream[E, B] = js.native
  /**
    * @callback Observable#flatMapWithConcurrencyLimit~f
    * @param {A} value
    * @returns {B|Initial<B>|Next<B>|End<B>|Error<E>|Observable<E, B>}
    */
  /**
    * @method Observable#flatMapWithConcurrencyLimit
    * @description For each element in the source [Observable]{@link Bacon.Observable}, spawn a new stream using the function `f`,  and collect events from each of the spawned streams into the result [EventStream]{@link Bacon.EventStream}, but limit the number of open spawned streams and buffers incoming events by `limit` amount. The return value of function `f` can be either an Observable (EventStream/[Property]{@link Bacon.Property}) or a constant value. [flatMapConcat]{@link Bacon.Observable#flatMapConcat} is [flatMapWithConcurrencyLimit]{@link Bacon.Observable#flatMapWithConcurrencyLimit}(1) (only one input active), and [flatMap]{@link Bacon.Observable#flatMap} is [flatMapWithConcurrencyLimit]{@link Bacon.Observable#flatMapWithConcurrencyLimit}(∞) (all inputs are piped to output). The result of `flatMapWithConcurrencyLimit` is always an EventStream.
    * @param {number} limit
    * @param {Observable#flatMapWithConcurrencyLimit~f} f
    * @returns {EventStream<E, B>}
    */
  def flatMapWithConcurrencyLimit[B](
    limit: Double,
    f: js.Function1[/* value */ A, B | Initial[B] | Next[B] | End[B] | Error[E] | (Observable[E, B])]
  ): EventStream[E, B] = js.native
  /**
    * @callback Observable#fold~f
    * @param {B} acc
    * @param {A} next
    * @returns {B}
    */
  /**
    * @method Observable#fold
    * @description Scans [Observable]{@link Bacon.Observable} with given `seed` value and accumulator function `f`, but only emits the final value, i.e. the value just before the Observable ends. Returns a [Property]{@link Bacon.Property}.
    * @param {B} seed
    * @param {Observable#fold~f} f
    * @returns {Property<E, B>}
    */
  def fold[B](seed: B, f: js.Function2[/* acc */ B, /* next */ A, B]): Property[E, B] = js.native
  /**
    * @callback Observable#onEnd~f
    * @returns {void}
    */
  /**
    * @callback Observable#onEnd~unsubscribe
    * @returns {void}
    */
  /**
    * @method Observable#onEnd
    * @description Subscribes a given handler function `f` to [End]{@link Bacon.End} event. The function `f` will be called when the [Observable]{@link Bacon.Observable} ends. Just like [EventStream.subscribe]{@link Bacon.EventStream#subscribe} and [Property.subscribe]{@link Bacon.Property#subscribe}, this method returns a function for `unsubscribe`ing.
    * @param {Observable#onEnd~f} f
    * @returns {Observable#onEnd~unsubscribe}
    */
  def onEnd(f: js.Function0[Unit]): js.Function0[Unit] = js.native
  /**
    * @callback Observable#onError~f
    * @param {E} error
    * @returns {void}
    */
  /**
    * @callback Observable#onError~unsubscribe
    * @returns {void}
    */
  /**
    * @method Observable#onError
    * @description Subscribes a given handler function `f` to [Error]{@link Bacon.Error} events. The function `f` will be called for each error in the [Observable]{@link Bacon.Observable}.
    * @param {Observable#onError~f} f
    * @returns {Observable#onError~unsubscribe}
    */
  def onError(f: js.Function1[/* error */ E, Unit]): js.Function0[Unit] = js.native
  /**
    * @callback Observable#onValue~f
    * @param {A} value
    * @returns {void}
    */
  /**
    * @callback Observable#onValue~unsubscribe
    * @returns {void}
    */
  /**
    * @method Observable#onValue
    * @description Subscribes a given handler function `f` to the [Observable]{@link Bacon.Observable}. Function will be called for each new value. This is the simplest way to assign a side-effect to an Observable. The difference to the [EventStream.subscribe]{@link Bacon.EventStream#subscribe} and [Property.subscribe]{@link Bacon.Property#subscribe} methods is that the actual stream `value`s are received, instead of [Event]{@link Bacon.Event} objects. [EventStream.onValue]{@link Bacon.EventStream#onValue} and [Property.onValue]{@link Bacon.Property#onValue} behave similarly, except that the latter also pushes the initial value of the Property, in case there is one.
    * @param {Observable#onValue~f} f
    * @returns {Observable#onValue~unsubscribe}
    */
  def onValue(f: js.Function1[/* value */ A, Unit]): js.Function0[Unit] = js.native
  /**
    * @callback Observable#reduce~f
    * @param {B} acc
    * @param {A} next
    * @returns {B}
    */
  /**
    * @method Observable#reduce
    * @description Scans [Observable]{@link Bacon.Observable} with given `seed` value and accumulator function `f`, but only emits the final value, i.e. the value just before the Observable ends. Returns a [Property]{@link Bacon.Property}.
    * @param {B} seed
    * @param {Observable#reduce~f} f
    * @returns {Property<E, B>}
    */
  def reduce[B](seed: B, f: js.Function2[/* acc */ B, /* next */ A, B]): Property[E, B] = js.native
  /**
    * @callback Observable#scan~f
    * @param {B} acc
    * @param {A} next
    * @returns {B}
    */
  /**
    * @method Observable#scan
    * @description Scans [Observable]{@link Bacon.Observable} with given `seed` value and accumulator function `f`, resulting to a [Property]{@link Bacon.Property}. For example, you might use zero as `seed` and a "plus" function as the accumulator to create an "integral" Property. When applied to a Property as in `r = p.scan(seed, f)`, there's a (hopefully insignificant) catch: the starting value for `r` depends on whether `p` has an initial value when `scan` is applied. If there's no initial value, this works identically to `[EventStream]{@link Bacon.EventStream}.scan`: the `seed` will be the initial value of `r`. However, if `r` already has a current/initial value `x`, the seed won't be output as is. Instead, the initial value of `r` will be `f(seed, x)`. This makes sense, because there can only be 1 initial value for a Property at a time.
    * @param {B} seed
    * @param {Observable#scan~f} f
    * @returns {Property<E, B>}
    * @example
    * Bacon.sequentially(1, [1, 2, 3]).scan(0, (a, b) => a + b);
    */
  def scan[B](seed: B, f: js.Function2[/* acc */ B, /* next */ A, B]): Property[E, B] = js.native
  /**
    * @method
    * @description Returns a [Property]{@link Bacon.Property} that represents a "sliding window" into the history of the values of the [Observable]{@link Bacon.Observable}. The resulting Property will have a value that is an array containing the last `n` values of the original Observable, where `n` is at most the value of the `max` argument, and at least the value of the `min` argument. If the `min` argument is omitted, there's no lower limit of values.
    * @param {number} max
    * @param {number} [min]
    * @returns {Property<E, A[]>}
    * @example
    * // If you have a EventStream `s` with a value sequence `1,2,3,4,5`, the respective values in `s.slidingWindow(2)` would be `[],[1],[1,2],[2,3],[3,4],[4,5]`:
    * Bacon.fromArray([1, 2, 3, 4, 5]).slidingWindow(2);
    * // The values of `s.slidingWindow(2,2)`would be `[1,2],[2,3],[3,4],[4,5]`:
    * Bacon.fromArray([1, 2, 3, 4, 5]).slidingWindow(2, 2);
    */
  def slidingWindow(max: Double): Property[E, js.Array[A]] = js.native
  def slidingWindow(max: Double, min: Double): Property[E, js.Array[A]] = js.native
  /**
    * @callback Observable#toPromise~promiseCtr
    * @param {A} value
    * @returns {Promise<A>}
    */
  /**
    * @method Observable#toPromise
    * @description Returns a Promise which will be resolved with the last event coming from an [Observable]{@link Bacon.Observable}. The global ES6 promise implementation will be used unless a promise constructor `promiseCtr` is given. Use a shim if you need to support legacy browsers or platforms.
    * @param {Observable#toPromise~promiseCtr} [promiseCtr]
    * @returns {Promise<A>}
    */
  def toPromise(): js.Promise[A] = js.native
  def toPromise(promiseCtr: js.Function1[/* value */ A, js.Promise[A]]): js.Promise[A] = js.native
  /**
    * @callback Observable#withStateMachine~f
    * @param {B} state
    * @param {Initial<A>|Next<A>|End<A>|Error<E>} event
    * @returns {[B, (Initial<C>|Next<C>|End<C>|Error<E>)[]]}
    */
  /**
    * @method Observable#withStateMachine
    * @description Lets you run a state machine on an [Observable]{@link Bacon.Observable}. Give it an initial state `initState` object and a state transformation function `f` that processes each incoming [Event]{@link Bacon.Event} and returns and array containing the next `state` and an array of output Event's.
    * @param {B} initState
    * @param {Observable#withStateMachine~f} f
    * @returns {EventStream<E, C>}
    * @example
    * // Calculate the total sum of all numbers in the stream and output the value on stream end:
    * Bacon.fromArray([1, 2, 3]).withStateMachine(0, (sum, event) => {
    *     if (event.hasValue()) {
    *         // had to cast to `number` because event:Bacon.Next<number>|Bacon.Error<{}>
    *         return [sum + <number>event.value(), []];
    *     } else if (event.isEnd()) {
    	 *         return [undefined, [new Bacon.Next(sum), event]];
    	 *     } else {
    	 *         return [sum, [event]];
    	 *     }
    	 * });
    */
  def withStateMachine[B, C](
    initState: B,
    f: js.Function2[
      /* state */ B, 
      /* event */ Initial[A] | Next[A] | End[A] | Error[E], 
      js.Tuple2[B, js.Array[Initial[C] | Next[C] | End[C] | Error[E]]]
    ]
  ): EventStream[E, C] = js.native
  /**
    * @callback Observable#zip~f
    * @param {A} a
    * @param {B} b
    * @returns {C}
    */
  /**
    * @method Observable#zip
    * @description Returns an [EventStream]{@link Bacon.EventStream} with elements pair-wise lined up with events from this and the `other` EventStream. A zipped EventStream will publish only when it has a value from each EventStream and will only produce values up to when any single EventStream ends. The given function `f` is used to create the result value from value in the two source EventStream. If no function `f` is given, the values are zipped into an array. Be careful not to have too much "drift" between streams. If one stream produces many more values than some other excessive buffering will occur inside the zipped observable.
    * @param {EventStream<E, B>} other
    * @param {Observable#zip~f} f
    * @returns {EventStream<E, C>}
    * @example
    * {
    *     let x = Bacon.fromArray([1, 2]),
    *         y = Bacon.fromArray([3, 4]);
    *     x.zip(y, (x, y) => x + y);
    * }
    */
  def zip[B, C](other: EventStream[E, B], f: js.Function2[/* a */ A, /* b */ B, C]): EventStream[E, C] = js.native
}

