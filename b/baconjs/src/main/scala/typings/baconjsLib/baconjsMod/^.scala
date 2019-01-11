package typings
package baconjsLib.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Bus: baconjsLib.Anon_A = js.native
  var EventStream: baconjsLib.Anon_Sink = js.native
  /**
    * @property more
    * @constant
    * @description The opaque value `sink` function may return. See [Bacon.fromBinder]{@link Bacon.fromBinder}.
    */
  var more: baconjsLib.BaconNs.More = js.native
  /**
    * @property noMore
    * @constant
    * @description The opaque value `sink` function may return. See [Bacon.fromBinder]{@link Bacon.fromBinder}.
    */
  var noMore: baconjsLib.BaconNs.NoMore = js.native
  /**
    * @function
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values so that the result Property will have an array of all property values as its value. Like [Bacon.combineAsArray]{@link Bacon.combineAsArray}, but `streams` are provided as a list of arguments as opposed to a single array.
    * @param {...(A|Observable<E, A>)} streams
    * @returns {Property<E, A[]>}
    */
  def combineAsArray[E, A](streams: (A | (baconjsLib.BaconNs.Observable[E, A]))*): baconjsLib.BaconNs.Property[E, js.Array[A]] = js.native
  /**
    * @function Bacon.combineAsArray
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values so that the result Property will have an array of all property values as its value. The input array may contain both Properties and EventStreams. In the latter case, the stream is first converted into a Property and then combined with the other Property's.
    * @param {(A|Observable<E, A>)[]} streams
    * @returns {Property<E, A[]>}
    */
  def combineAsArray[E, A](streams: js.Array[A | (baconjsLib.BaconNs.Observable[E, A])]): baconjsLib.BaconNs.Property[E, js.Array[A]] = js.native
  /**
    * @function
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values using a `template` object.
    * @param {{string:number|boolean|string|Object|Observable<E, *>}} template
    * @returns {Property<E, A>}
    */
  def combineTemplate[E, A](
    template: org.scalablytyped.runtime.StringDictionary[
      scala.Double | scala.Boolean | java.lang.String | js.Object | (baconjsLib.BaconNs.Observable[E, _])
    ]
  ): baconjsLib.BaconNs.Property[E, A] = js.native
  /**
    * @callback Property#combineWith~f
    * @param {...A} args
    * @returns {B}
    */
  /**
    * @function Property#combineWith
    * @description Combines given n [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values using the given n-ary function `f`.
    * @param {Property#combineWith~f} f
    * @param {...(A|Observable<E, A>)} streams
    * @returns {Property<E, B>}
    */
  def combineWith[A, B](
    f: js.Function1[/* repeated */ A, B],
    streams: (A | (baconjsLib.BaconNs.Observable[stdLib.ErrorEvent, A]))*
  ): baconjsLib.BaconNs.Property[stdLib.ErrorEvent, B] = js.native
  /**
    * @function
    * @description Creates a constant [Property]{@link Bacon.Property} with value `x`.
    * @param {A} x
    * @returns {Property<E, A>}
    */
  def constant[E, A](x: A): baconjsLib.BaconNs.Property[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} that delivers the given series of `values` (given as array) to the first subscriber. The stream ends after these values have been delivered. You can also send [Error]{@link Bacon.Error} events, or any combination of pure values and error events.
    * @param {(A|Error<E>)[]} values
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromArray([1, new Bacon.Error("")]);
    */
  def fromArray[E, A](values: js.Array[A | baconjsLib.BaconNs.Error[E]]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromBinder~subscribe
    * @param {Bacon.fromBinder~sink} sink
    * @returns {Bacon.fromBinder~unsubscribe}
    */
  /**
    * @callback Bacon.fromBinder~sink
    * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
    * @returns {void}
    */
  /**
    * @callback Bacon.fromBinder~unsubscribe
    * @returns {void}
    */
  /**
    * @function Bacon.fromBinder
    * @description Creates an [EventStream]{@link Bacon.EventStream} with the given [subscribe]{@link Bacon.fromBinder~subscribe} function. The parameter `subscribe` is a function that accepts a [sink]{@link Bacon.fromBinder~sink} which is a function that your `subscribe` function can "push" events to. You can push: a plain value, like `"first value"`; an [Event]{@link Bacon.Event} object including [Error]{@link Bacon.Error} (wraps an error) and [End]{@link Bacon.End} (indicates stream end); an array of event objects at once. The `subscribe` function must return a function. Let's call that function [unsubscribe]{@link Bacon.fromBinder~unsubscribe}. The returned function can be used by the subscriber (directly or indirectly) to unsubscribe from the EventStream. It should release all resources that the `subscribe` function reserved. The `sink` function may return [noMore]{@link Bacon.noMore} (as well as [more]{@link Bacon.more} or any other value). If it returns `noMore`, no further events will be consumed by the subscriber. The `subscribe` function may choose to clean up all resources at this point (e.g., by calling `unsubscribe`). This is usually not necessary, because further calls to `sink` are ignored, but doing so can increase performance in rare cases. The EventStream will wrap your `subscribe` function so that it will only be called when the first stream listener is added, and the `unsubscribe` function is called only after the last listener has been removed. The subscribe-unsubscribe cycle may of course be repeated indefinitely, so prepare for multiple calls to the `subscribe` function.
    * @param {Bacon.fromBinder~subscribe} subscribe
    * @returns {EventStream<E, A>}
    * @example
    * let stream = Bacon.fromBinder(sink => {
    *     sink("first value");
    *     sink([new Bacon.Next("2nd"), new Bacon.Next("3rd")]);
    *     sink(new Bacon.Next(() => {
    *         return "This one will be evaluated lazily"
    *     }));
    *     sink(new Bacon.Error("oops, an error"));
    *     sink(new Bacon.End());
    *     return () => {
    *         // unsub functionality here, this one's a no-op
    *     };
    * });
    * stream.log();
    */
  def fromBinder[E, A](
    subscribe: js.Function1[
      /* sink */ js.Function1[
        /* value */ baconjsLib.BaconNs.More | baconjsLib.BaconNs.NoMore | A | baconjsLib.BaconNs.Initial[A] | baconjsLib.BaconNs.Next[A] | baconjsLib.BaconNs.End[A] | baconjsLib.BaconNs.Error[E] | (js.Array[
          A | baconjsLib.BaconNs.Initial[A] | baconjsLib.BaconNs.Next[A] | baconjsLib.BaconNs.End[A] | baconjsLib.BaconNs.Error[E]
        ]), 
        scala.Unit
      ], 
      js.Function0[scala.Unit]
    ]
  ): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromCallback1~f
    * @param {Bacon.fromCallback1~callback} callback
    * @returns {void}
    */
  /**
    * @callback Bacon.fromCallback1~callback
    * @param {...*} args
    * @returns {void}
    */
  /**
    * @function Bacon.fromCallback1
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a `callback`. The function is supposed to call its callback just once.
    * @param {Bacon.fromCallback1~f} f
    * @returns {EventStream<E, A>}
    * @example
    * // This would create a stream that outputs a single value "Bacon!" and ends after that. The use of setTimeout causes the value to be delayed by 1 second.
    * Bacon.fromCallback(callback => {
    *     setTimeout(() => {
    *         callback("Bacon!");
    *     }, 1000);
    * });
    */
  def fromCallback[E, A](f: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromCallback2~f
    * @param {...*} args
    * @returns {void}
    */
  /**
    * @function Bacon.fromCallback2
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a `callback`. The function is supposed to call its callback just once.
    * @param {Bacon.fromCallback2~f} f
    * @param {...*} args
    * @returns {EventStream<E, A>}
    * @example
    * // You can also give any number of arguments to `fromCallback`, which will be passed to the function. These arguments can be simple variables, Bacon EventStreams or Properties. For example the following will output "Bacon rules":
    * Bacon.fromCallback((a, b, callback) => {
    *     callback(a + " " + b);
    * }, Bacon.constant("bacon"), "rules").log();
    */
  def fromCallback[E, A](f: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `methodName` method of a given `object`. The function is supposed to call its callback just once.
    * @param {Object} object
    * @param {string} methodName
    * @param {...*} args
    * @returns {EventStream<E, A>}
    */
  def fromCallback[E, A](`object`: js.Object, methodName: java.lang.String, args: js.Any*): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromEvent[E, A](target: baconjsLib.JQuery, eventName: java.lang.String): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromEvent[E, A](target: nodeLib.NodeJSNs.EventEmitter, eventName: java.lang.String): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a DOM EventTarget or Node.JS EventEmitter object, or an object that supports event listeners using `on`/`off` methods.
    * @param {EventTarget|NodeJS.EventEmitter|JQuery} target
    * @param {string} eventName
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromEvent(document.body, "click").onValue(() => {
    *     alert("Bacon!");
    * });
    * Bacon.fromEvent(process.stdin, "readable", () => {
    *     alert("Bacon!");
    * });
    * Bacon.fromEvent($("body"), "click").onValue(() => {
    *     alert("Bacon!");
    * });
    */
  def fromEvent[E, A](target: stdLib.EventTarget, eventName: java.lang.String): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromEvent[E, A, B](
    target: baconjsLib.JQuery,
    eventName: java.lang.String,
    eventTransformer: js.Function1[/* event */ A, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  def fromEvent[E, A, B](
    target: nodeLib.NodeJSNs.EventEmitter,
    eventName: java.lang.String,
    eventTransformer: js.Function1[/* event */ A, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.fromEvent~eventTransformer
    * @param {A} event
    * @returns {B}
    */
  /**
    * @function Bacon.fromEvent
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a DOM EventTarget or Node.JS EventEmitter object, or an object that supports event listeners using `on`/`off` methods. You can pass a function `eventTransformer` that transforms the emitted events' parameters.
    * @param {EventTarget|NodeJS.EventEmitter|JQuery} target
    * @param {string} eventName
    * @param {Bacon.fromEvent~eventTransformer} eventTransformer
    * @returns {EventStream<E, B>}
    * @example
    * Bacon.fromEvent(document.body, "click", (event:MouseEvent) => event.clientX).onValue(clientX => {
    *     alert("Bacon!");
    * });
    */
  def fromEvent[E, A, B](
    target: stdLib.EventTarget,
    eventName: java.lang.String,
    eventTransformer: js.Function1[/* event */ A, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.fromNodeCallback~f
    * @param {Bacon.fromNodeCallback~callback} callback
    * @returns {void}
    */
  /**
    * @callback Bacon.fromNodeCallback~callback
    * @param {E} error
    * @param {A} data
    * @returns {void}
    */
  /**
    * @function Bacon.fromNodeCallback
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a Node.js `callback`: callback(error, data), where error is `null` if everything is fine. The function is supposed to call its callback just once.
    * @param {Bacon.fromNodeCallback~f} f
    * @param {...*} args
    * @returns {EventStream<E, A>}
    * @example
    * {
    *     let fs = require("fs"),
    *         read = Bacon.fromNodeCallback(fs.readFile, "input.txt");
    *     read.onError(error => {
    *        console.log("Reading failed: " + error);
    *     });
    *     read.onValue(value => {
    *         console.log("Read contents: " + value);
    *     });
    * }
    */
  def fromNodeCallback[E, A](
    f: js.Function1[/* callback */ js.Function2[/* error */ E, /* data */ A, scala.Unit], scala.Unit],
    args: js.Any*
  ): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `methodName` method of a given `object`.
    * @param {Object} object
    * @param {string} methodName
    * @param {...*} args
    * @returns {EventStream<E, A>}
    */
  def fromNodeCallback[E, A](`object`: js.Object, methodName: java.lang.String, args: js.Any*): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromPoll~f
    * @returns {Next<A>|End<A>}
    */
  /**
    * @function Bacon.fromPoll
    * @description Polls given function `f` with given `interval`. Function should return events: either [Next]{@link Bacon.Next} or [End]{@link Bacon.End}. Polling occurs only when there are subscribers to the stream. Polling ends permanently when `f` returns [End]{@link Bacon.End}.
    * @param {number} interval
    * @param {Bacon.fromPoll~f} f
    * @returns {EventStream<E, A>}
    */
  def fromPoll[E, A](interval: scala.Double, f: js.Function0[baconjsLib.BaconNs.Next[A] | baconjsLib.BaconNs.End[A]]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromPromise[E, A](promise: jqueryLib.JQueryXHR): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromPromise[E, A](promise: jqueryLib.JQueryXHR, abort: scala.Boolean): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `promise` Promise object such as JQuery Ajax. This stream will contain a single value or an error, followed immediately by stream end. You can use the optional `abort` flag (i.e. ´Bacon.fromPromise(p, true)´ to have the `abort` method of the given promise be called when all subscribers have been removed from the created stream.
    * @param {PromiseLike<A>|JQueryXHR} promise
    * @param {boolean} [abort]
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"));
    * Bacon.fromPromise(Promise.resolve(1));
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"), true);
    * Bacon.fromPromise(Promise.resolve(1), false);
    */
  def fromPromise[E, A](promise: js.Thenable[A]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromPromise[E, A](promise: js.Thenable[A], abort: scala.Boolean): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def fromPromise[E, A, B](
    promise: jqueryLib.JQueryXHR,
    abort: scala.Boolean,
    eventTransformer: js.Function1[
      /* value */ A, 
      js.Array[
        baconjsLib.BaconNs.Initial[B] | baconjsLib.BaconNs.Next[B] | baconjsLib.BaconNs.End[B] | baconjsLib.BaconNs.Error[E]
      ]
    ]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.fromPromise~eventTransformer
    * @param {A} value
    * @returns {(Initial<B>|Next<B>|End<B>|Error<E>)[]}
    */
  /**
    * @function Bacon.fromPromise
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `promise` Promise object such as JQuery Ajax. This stream will contain a single value or an error, followed immediately by stream end. You can use the `abort` flag (i.e. ´Bacon.fromPromise(p, true)´ to have the `abort` method of the given promise be called when all subscribers have been removed from the created stream, and also pass a function `eventTransformer` that transforms the promise value into Events. The default is to transform the value into `[new Bacon.Next(value), new Bacon.End()]`.
    * @param {PromiseLike<A>|JQueryXHR} promise
    * @param {boolean} abort
    * @param {Bacon.fromPromise~eventTransformer} eventTransformer
    * @returns {EventStream<E, B>}
    * @example
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"), true, (n:string) => {
    *     return [new Bacon.Next(n), new Bacon.Next(() => n), new Bacon.End()];
    * });
    * Bacon.fromPromise(Promise.resolve(1), false, n => {
    *     return [new Bacon.Next(n), new Bacon.Next(() => n), new Bacon.End()];
    * });
    */
  def fromPromise[E, A, B](
    promise: js.Thenable[A],
    abort: scala.Boolean,
    eventTransformer: js.Function1[
      /* value */ A, 
      js.Array[
        baconjsLib.BaconNs.Initial[B] | baconjsLib.BaconNs.Next[B] | baconjsLib.BaconNs.End[B] | baconjsLib.BaconNs.Error[E]
      ]
    ]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @function
    * @description Repeats the single `value` indefinitely with the given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def interval[E, A](interval: scala.Double, value: A): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates a single-element [EventStream]{@link Bacon.EventStream} that produces given `value` after a given `delay` (in milliseconds).
    * @param {number} delay
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def later[E, A](delay: scala.Double, value: A): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Merges given array of [EventStream]{@link Bacon.EventStream}s.
    * @param {...EventStream<E, A>} streams
    * @returns {EventStream<E, A>}
    */
  def mergeAll[E, A](streams: (baconjsLib.BaconNs.EventStream[E, A])*): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Merges given array of [EventStream]{@link Bacon.EventStream}s.
    * @param {EventStream<E, A>[]} streams
    * @returns {EventStream<E, A>}
    */
  def mergeAll[E, A](streams: js.Array[baconjsLib.BaconNs.EventStream[E, A]]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function Bacon.never
    * @description Creates an [EventStream]{@link Bacon.EventStream} that immediately ends.
    * @returns {EventStream<E, A>}
    */
  def never[E, A](): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Is a shorthand for combining multiple sources ([EventStream]{@link Bacon.EventStream}s, [Property]{@link Bacon.Property}s, constants) as array and assigning the side-effect function `f` for the values.
    * @param {...*} args
    * @returns {void}
    */
  def onValues(args: js.Any*): scala.Unit = js.native
  /**
    * @function Bacon.once
    * @description Creates an [EventStream]{@link Bacon.EventStream} that delivers the given single `value` for the first subscriber. The stream will end immediately after this value. You can also send an [Error]{@link Bacon.Error} event instead of a `value`.
    * @param {A|Error<E>} value
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.once(new Bacon.Error("fail"));
    */
  def once[E, A](value: A): baconjsLib.BaconNs.EventStream[E, A] = js.native
  def once[E, A](value: baconjsLib.BaconNs.Error[E]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.repeat~f
    * @param {number} iteration
    * @returns {boolean|Observable<E, A>}
    */
  /**
    * @function Bacon.repeat
    * @description Calls generator function `f` which is expected to return an [Observable]{@link Bacon.Observable}. The returned [EventStream]{@link Bacon.EventStream} contains values and errors from the spawned observable. When the spawned Observable ends, the generator `f` is called again to spawn a new Observable. This is repeated until the generator `f` returns a falsy value (such as `undefined` or `false`). The generator `f` is called with one argument — `iteration` number starting from `0`.
    * @param {Bacon.repeat~f} f
    * @returns {EventStream<E, A>}
    * @example
    * // The following will produce values `0,1,2`.
    * Bacon.repeat(i => {
    *     if (i < 3) {
    *         return Bacon.once(i);
    *     } else {
    *         return false;
    *     }
    * }).log();
    */
  def repeat[E, A](
    f: js.Function1[
      /* iteration */ scala.Double, 
      scala.Boolean | (baconjsLib.BaconNs.Observable[E, A])
    ]
  ): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @function
    * @description Repeats given `values` indefinitely with then given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A[]} values
    * @returns {EventStream<E, A>}
    * @example
    * // The following would lead to `1,2,3,1,2,3...` to be repeated indefinitely:
    * Bacon.fromArray([1, new Bacon.Error("")]);
    */
  def repeatedly[E, A](interval: scala.Double, values: js.Array[A]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.retry1~source
    * @description Function that produces an [EventStream]{@link Bacon.EventStream}.
    * @returns {EventStream<E, A>}
    */
  /**
    * @callback Bacon.retry1~isRetryable
    * @description Function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The [Error]{@link Bacon.Error} that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @callback Bacon.retry1~delay
    * @description Function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a `context` object with the keys `error` (the [Error]{@link Bacon.Error} that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay, e.g. for an incremental backoff.
    * @param {Object} context
    * @param {E} context.error [Error]{@link Bacon.Error} that occurred
    * @param {number} context.retriesDone number of retries already performed
    * @returns {number}
    */
  /**
    * @function Bacon.retry1
    * @description Is used to retry the call when there is an [Error]{@link Bacon.Error} event in the [EventStream]{@link Bacon.EventStream} produced by the `source` function.
    * @param {Object} options
    * @param {Bacon.retry1~source} options.source function that produces an [EventStream]{@link Bacon.EventStream}
    * @param {number} options.retries number of times to retry the `source` function in addition to the initial attempt
    * @param {Bacon.retry1~isRetryable} [options.isRetryable] function returning `true` to continue retrying, `false` to stop. Defaults to `true`.
    * @param {Bacon.retry1~delay} [options.delay] - function that returns the time in milliseconds to wait before retrying. Defaults to `0`.
    * @returns {EventStream<E, A>}
    */
  def retry[E, A](options: baconjsLib.Anon_Context[E, A]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.retry1~source
    * @description Function that produces an [Property]{@link Bacon.Property}.
    * @returns {Property<E, A>}
    */
  /**
    * @callback Bacon.retry1~isRetryable
    * @description Function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The [Error]{@link Bacon.Error} that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @callback Bacon.retry1~delay
    * @description Function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a `context` object with the keys `error` (the [Error]{@link Bacon.Error} that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay, e.g. for an incremental backoff.
    * @param {Object} context
    * @param {E} context.error [Error]{@link Bacon.Error} that occurred
    * @param {number} context.retriesDone number of retries already performed
    * @returns {number}
    */
  /**
    * @function Bacon.retry1
    * @description Is used to retry the call when there is an [Error]{@link Bacon.Error} event in the [Property]{@link Bacon.Property} produced by the `source` function.
    * @param {Object} options
    * @param {Bacon.retry1~source} options.source function that produces an [Property]{@link Bacon.Property}
    * @param {number} options.retries number of times to retry the `source` function in addition to the initial attempt
    * @param {Bacon.retry1~isRetryable} [options.isRetryable] function returning `true` to continue retrying, `false` to stop. Defaults to `true`.
    * @param {Bacon.retry1~delay} [options.delay] - function that returns the time in milliseconds to wait before retrying. Defaults to `0`.
    * @returns {Property<E, A>}
    */
  def retry[E, A](options: baconjsLib.Anon_ContextDelay[E, A]): baconjsLib.BaconNs.Property[E, A] = js.native
  /**
    * @function
    * @description Creates a [EventStream]{@link Bacon.EventStream} containing given `values` (given as array) with the given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A[]} values
    * @returns {EventStream<E, A>}
    */
  def sequentially[E, A](interval: scala.Double, values: js.Array[A]): baconjsLib.BaconNs.EventStream[E, A] = js.native
  /**
    * @callback Bacon.update1~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @method Bacon.update1
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update1~f1} f1
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def update[E, A1, B](
    initial: B,
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B]
  ): baconjsLib.BaconNs.Property[E, B] = js.native
  /**
    * @callback Bacon.update2~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update2~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @method Bacon.update2
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update2~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update2~f2} f2
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def update[E, A1, A2, B](
    initial: B,
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B]
  ): baconjsLib.BaconNs.Property[E, B] = js.native
  /**
    * @callback Bacon.update3~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update3~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update3~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @method Bacon.update3
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update3~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update3~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update3~f3} f3
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def update[E, A1, A2, A3, B](
    initial: B,
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B]
  ): baconjsLib.BaconNs.Property[E, B] = js.native
  /**
    * @callback Bacon.update4~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f4
    * @param {B} initial
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @method Bacon.update4
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update4~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update4~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update4~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.update4~f4} f4
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def update[E, A1, A2, A3, A4, B](
    initial: B,
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B],
    pattern4: js.Array[baconjsLib.BaconNs.Observable[E, A4]],
    f4: js.Function2[/* initial */ B, /* repeated */ A4, B]
  ): baconjsLib.BaconNs.Property[E, B] = js.native
  /**
    * @callback Bacon.update5~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f4
    * @param {B} initial
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f5
    * @param {B} initial
    * @param {...A5} args
    * @returns {B}
    */
  /**
    * @method Bacon.update5
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update5~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update5~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update5~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.update5~f4} f4
    * @param {Observable<E, A5>[]} pattern5
    * @param {Bacon.update5~f5} f5
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def update[E, A1, A2, A3, A4, A5, B](
    initial: B,
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B],
    pattern4: js.Array[baconjsLib.BaconNs.Observable[E, A4]],
    f4: js.Function2[/* initial */ B, /* repeated */ A4, B],
    pattern5: js.Array[baconjsLib.BaconNs.Observable[E, A5]],
    f5: js.Function2[/* initial */ B, /* repeated */ A5, B]
  ): baconjsLib.BaconNs.Property[E, B] = js.native
  /**
    * @callback Bacon.when1~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @method Bacon.when1
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when1~f1} f1
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def when[E, A1, B](pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]], f1: js.Function1[/* repeated */ A1, B]): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.when2~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when2~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @method Bacon.when2
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when2~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when2~f2} f2
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def when[E, A1, A2, B](
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.when3~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when3~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when3~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @method Bacon.when3
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when3~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when3~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when3~f3} f3
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def when[E, A1, A2, A3, B](
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.when4~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f4
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @method Bacon.when4
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when4~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when4~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when4~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.when4~f4} f4
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def when[E, A1, A2, A3, A4, B](
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B],
    pattern4: js.Array[baconjsLib.BaconNs.Observable[E, A4]],
    f4: js.Function1[/* repeated */ A4, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.when5~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f4
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f5
    * @param {...A5} args
    * @returns {B}
    */
  /**
    * @method Bacon.when5
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when5~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when5~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when5~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.when5~f4} f4
    * @param {Observable<E, A5>[]} pattern5
    * @param {Bacon.when5~f5} f5
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def when[E, A1, A2, A3, A4, A5, B](
    pattern1: js.Array[baconjsLib.BaconNs.Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[baconjsLib.BaconNs.Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[baconjsLib.BaconNs.Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B],
    pattern4: js.Array[baconjsLib.BaconNs.Observable[E, A4]],
    f4: js.Function1[/* repeated */ A4, B],
    pattern5: js.Array[baconjsLib.BaconNs.Observable[E, A5]],
    f5: js.Function1[/* repeated */ A5, B]
  ): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @function
    * @description Zips the `streams` in to a new [EventStream]{@link Bacon.EventStream} that will have an array of values from each source EventStream as its value. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. EventStream's are provided as a list of arguments as opposed to a single array. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {...EventStream<E, A>} streams
    * @returns {EventStream<E, A[]>}
    */
  def zipAsArray[E, A](streams: (baconjsLib.BaconNs.EventStream[E, A])*): baconjsLib.BaconNs.EventStream[E, js.Array[A]] = js.native
  /**
    * @function
    * @description Zips the array of `streams` in to a new [EventStream]{@link Bacon.EventStream} that will have an array of values from each source EventStream as its value. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {EventStream<E, A>[]} streams
    * @returns {EventStream<E, A[]>}
    */
  def zipAsArray[E, A](streams: js.Array[baconjsLib.BaconNs.EventStream[E, A]]): baconjsLib.BaconNs.EventStream[E, js.Array[A]] = js.native
  /**
    * @callback Bacon.zipWith2~f
    * @param {...A} args
    * @returns {B}
    */
  /**
    * @function Bacon.zipWith2
    * @description Zips the `streams` in to a new [EventStream]{@link Bacon.EventStream} that will combine the n values from EventStream's with n-ary function `f`. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. Streams are provided as a list of arguments as opposed to a single array. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {Bacon.zipWith2~f} f
    * @param {...EventStream<E, A>} streams
    * @returns {EventStream<E, B>}
    */
  def zipWith[E, A, B](f: js.Function1[/* repeated */ A, B], streams: (baconjsLib.BaconNs.EventStream[E, A])*): baconjsLib.BaconNs.EventStream[E, B] = js.native
  /**
    * @callback Bacon.zipWith1~f
    * @param {...A} args
    * @returns {B}
    */
  /**
    * @function Bacon.zipWith1
    * @description Zips the array of `streams` in to a new [EventStream]{@link Bacon.EventStream} that will combine the n values from EventStream's with n-ary function `f`. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {EventStream<E, A>[]} streams
    * @param {Bacon.zipWith1~f} f
    * @returns {EventStream<E, B>}
    */
  def zipWith[E, A, B](streams: js.Array[baconjsLib.BaconNs.EventStream[E, A]], f: js.Function1[/* repeated */ A, B]): baconjsLib.BaconNs.EventStream[E, B] = js.native
}

