package typings
package baconjsLib.BaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class EventStream
  * @augments Bacon.Observable
  * @description A stream of events.
  * */
@js.native
trait EventStream[E, A] extends Observable[E, A] {
  /**
    * @method
    * @description Buffers the [EventStream]{@link Bacon.EventStream} events with given `count`. The buffer is flushed when it contains the given `count` of elements.
    * @param {number} count
    * @returns {EventStream<E, A[]>}
    * @example
    * // You will get output events with values `[1, 2]`, `[3, 4]` and `[5]`.
    * Bacon.fromArray([1, 2, 3, 4, 5]).bufferWithCount(2);
    */
  def bufferWithCount(count: scala.Double): EventStream[E, js.Array[A]] = js.native
  /**
    * @method
    * @description Buffers the [EventStream]{@link Bacon.EventStream} with given `delay` (in milliseconds). The buffer is flushed at most once in the given `delay`.
    * @param {number} delay
    * @returns {EventStream<E, A[]>}
    * @example
    * // You might get two events containing [1,2,3,4] and [5,6,7] respectively, given that the flush occurs between numbers 4 and 5:
    * Bacon.fromArray([1, 2, 3, 4, 5, 6, 7]).bufferWithTime(0);
    */
  def bufferWithTime(delay: scala.Double): EventStream[E, js.Array[A]] = js.native
  /**
    * @callback EventStream#bufferWithTime~f
    * @param {EventStream#bufferWithTime~defer} defer
    * @returns {void}
    */
  /**
    * @callback EventStream#bufferWithTime~defer
    * @param {...*} args
    * @returns {void}
    */
  /**
    * @method EventStream#bufferWithTime
    * @description Buffers the [EventStream]{@link Bacon.EventStream} with given "defer-function" `f`.
    * @param {EventStream#bufferWithTime~f} f
    * @returns {EventStream<E, A[]>}
    * @example
    * // Here's an equivalent to `stream.bufferWithTime(10)`:
    * let stream = Bacon.fromArray([1, 2, 3, 4, 5, 6, 7]);
    * stream.bufferWithTime(f => { setTimeout(f, 10); }); }
    */
  def bufferWithTime(f: js.Function1[/* defer */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit]): EventStream[E, js.Array[A]] = js.native
  /**
    * @method
    * @description Buffers the [EventStream]{@link Bacon.EventStream} events and flushes when either the buffer contains the given `count` of elements or the given `delay` (in milliseconds) has passed since last buffered event.
    * @param {number} delay
    * @param {number} count
    * @returns {EventStream<E, A[]>}
    */
  def bufferWithTimeOrCount(delay: scala.Double, count: scala.Double): EventStream[E, js.Array[A]] = js.native
  /**
    * @method
    * @description Concatenates two [EventStream]{@link Bacon.EventStream}s into one so that it will deliver events from EventStream until it ends and then deliver events from `otherStream`. This means too that events from `otherStream`, occurring before the end of EventStream will not be included in the result EventStream.
    * @param {EventStream<E, A>} otherStream
    * @returns {EventStream<E, A>}
    */
  def concat(otherStream: EventStream[E, A]): EventStream[E, A] = js.native
  /**
    * @method EventStream#debounce
    * @description Throttles the [EventStream]{@link Bacon.EventStream} by given `delay` (in milliseconds), but so that event is only emitted after the given "quiet period". The difference of [throttle]{@link Bacon.EventStream#throttle} and [debounce]{@link Bacon.EventStream#debounce} is the same as it is in the same methods in jQuery.
    * @param {number} delay
    * @returns {EventStream<E, A>}
    */
  def debounce(delay: scala.Double): EventStream[E, A] = js.native
  /**
    * @method
    * @description Passes the first event in the [EventStream]{@link Bacon.EventStream} through, but after that, only passes events after a given `delay` (in milliseconds) have passed since previous output.
    * @param {number} delay
    * @returns {EventStream<E, A>}
    */
  def debounceImmediate(delay: scala.Double): EventStream[E, A] = js.native
  /**
    * @method
    * @description Delays the [EventStream]{@link Bacon.EventStream} by given `delay` (in milliseconds).
    * @param {number} delay
    * @returns {EventStream<E, A>}
    */
  def delay(delay: scala.Double): EventStream[E, A] = js.native
  /**
    * @callback EventStream#doAction~f
    * @param {A} value
    * @returns {void}
    */
  /**
    * @method EventStream#doAction
    * @description Returns an [EventStream]{@link Bacon.EventStream} where the function `f` is executed for each value, before dispatching to subscribers. This is useful for debugging, but also for stuff like calling the `preventDefault()` method for events.
    * @param {EventStream#doAction~f} f
    * @returns {EventStream<E, A>}
    */
  def doAction(f: js.Function1[/* value */ A, scala.Unit]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Returns an [EventStream]{@link Bacon.EventStream} where the `propertyExtractor` string is applied to each value, before dispatching to subscribers. This is useful for debugging, but also for stuff like calling the `preventDefault()` method for events.
    * @param {string} propertyExtractor
    * @returns {EventStream<E, A>}
    */
  def doAction(propertyExtractor: java.lang.String): EventStream[E, A] = js.native
  /**
    * @callback EventStream#doError~f
    * @param {E} error
    * @returns {void}
    */
  /**
    * @method EventStream#doError
    * @description Returns an [EventStream]{@link Bacon.EventStream} where the function `f` is executed for each error, before dispatching to subscribers. That is, same as `doAction` but for errors.
    * @param {EventStream#doError~f} f
    * @returns {EventStream<E, A>}
    */
  def doError(f: js.Function1[/* error */ E, scala.Unit]): EventStream[E, A] = js.native
  /**
    * @method EventStream#doLog
    * @description Logs each value of the [EventStream]{@link Bacon.EventStream} to the console. [doLog]{@link Bacon.EventStream#doLog} behaves like [log]{@link Bacon.EventStream#log} but does not subscribe to the EventStream. You can think of `doLog` as a logger function that – unlike `log` – is safe to use in production. `doLog` is safe, because it does not cause the same surprising side-effects as `log` does.
    * @param {string} [label]
    * @returns {EventStream<E, A>}
    */
  def doLog(): EventStream[E, A] = js.native
  def doLog(label: java.lang.String): EventStream[E, A] = js.native
  /**
    * @method
    * @description Ends the [EventStream]{@link Bacon.EventStream} on first [Error]{@link Bacon.Error} event. The error is included in the output of the returned EventStream.
    * @returns {EventStream<E, A>}
    */
  def endOnError(): EventStream[E, A] = js.native
  /**
    * @callback EventStream#endOnError~f
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @method EventStream#endOnError
    * @description Ends the [EventStream]{@link Bacon.EventStream} on first [Error]{@link Bacon.Error} event for which the given predicate function `f` returns `true`. The error is included in the output of the returned EventStream.
    * @param {EventStream#endOnError} f
    * @returns {EventStream<E, A>}
    */
  def endOnError(f: js.Function1[/* error */ E, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Returns an [EventStream]{@link Bacon.EventStream} containing [Error]{@link Bacon.Error} events only. Same as filtering with a function that always returns `false`.
    * @returns {EventStream<E, A>}
    */
  def errors(): EventStream[E, A] = js.native
  /**
    * @method
    * @description Filters [EventStream]{@link Bacon.EventStream} values using a given `constant` value (`true` to include all, `false` to exclude all).
    * @param {boolean} bool
    * @returns {EventStream<E, A>}
    */
  def filter(bool: scala.Boolean): EventStream[E, A] = js.native
  /**
    * @callback EventStream#filter~f
    * @param {A} value
    * @returns {boolean}
    */
  /**
    * @method EventStream#filter
    * @description Filters [EventStream]{@link Bacon.EventStream} `value`s using a given predicate function `f`.
    * @param {EventStream#filter~f} f
    * @returns {EventStream<E, A>}
    */
  def filter(f: js.Function1[/* value */ A, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Filters [EventStream]{@link Bacon.EventStream} values using a given `propertyExtractor` string (like ".isValuable").
    * @param {string} propertyExtractor
    * @returns {EventStream<E, A>}
    */
  def filter(propertyExtractor: java.lang.String): EventStream[E, A] = js.native
  /**
    * @method
    * @description Filters [EventStream]{@link Bacon.EventStream} values based on the value of a [Property]{@link Bacon.Property} `property`. [Event]{@link Bacon.Event} will be included in output IF AND ONLY IF the `property` holds `true` at the time of the event.
    * @param {Property<E, boolean>} property
    * @returns {EventStream<E, A>}
    */
  def filter(property: Property[E, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Takes the first element from the [EventStream]{@link Bacon.EventStream}. Essentially [Observable.take]{@link Bacon.EventStream#take}(1).
    * @returns {EventStream<E, A>}
    */
  def first(): EventStream[E, A] = js.native
  /**
    * @callback EventStream#groupBy1~keyF
    * @param {A} value
    * @returns {B}
    */
  /**
    * @method EventStream#groupBy1
    * @description Groups [EventStream]{@link Bacon.EventStream} events to new EventStream's by `keyF`.
    * @param {EventStream#groupBy1~keyF} keyF
    * @returns {EventStream<E, EventStream<E, A>>}
    */
  def groupBy[B](keyF: js.Function1[/* value */ A, B]): EventStream[E, EventStream[E, A]] = js.native
  /**
    * @callback keyF
    * @param {A} value
    * @returns {B}
    */
  /**
    * @callback limitF
    * @param {EventStream<E, A>} groupedStream
    * @param {Initial<A>|Next<A>|End<A>|Error<E>} groupStartingEvent
    * @returns {EventStream<E, C>}
    */
  /**
    * @description Groups [EventStream]{@link Bacon.EventStream} events to new EventStream's by `keyF`. `limitF` is provided to limit grouped stream life. EventStream transformed by `limitF` is passed on if provided. `limitF` gets grouped stream and the original [Event]{@link Bacon.Event} causing the EventStream to start as parameters.
    * @param {keyF} keyF
    * @param {limitF} limitF
    * @returns {EventStream<E, EventStream<E, C>>} Grouped streams.
    */
  def groupBy[B, C](
    keyF: js.Function1[/* value */ A, B],
    limitF: js.Function2[
      /* groupedStream */ EventStream[E, A], 
      /* groupStartingEvent */ Initial[A] | Next[A] | End[A] | Error[E], 
      EventStream[E, C]
    ]
  ): EventStream[E, EventStream[E, C]] = js.native
  /**
    * @method
    * @description Pauses and buffers the [EventStream]{@link Bacon.EventStream} if last event in `valve` is truthy. All buffered events are released when `valve` becomes falsy.
    * @param {Observable<E, B>} valve
    * @returns {EventStream<E, A>}
    */
  def holdWhen[B](valve: Observable[E, B]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Takes the last element from the [EventStream]{@link Bacon.EventStream}. None, if EventStream is empty.
    * @returns {EventStream<E, A>}
    * @example
    * // This creates the stream which doesn't produce any events and never ends:
    * Bacon.interval(1e1, 0).last();
    */
  def last(): EventStream[E, A] = js.native
  /**
    * @method EventStream#log
    * @description Logs each value of the [EventStream]{@link Bacon.EventStream} to the console. It optionally takes a `label` argument to pass to `console.log()` alongside each value. To assist with chaining, it returns the original EventStream. Note that as a side-effect, the EventStream will have a constant listener and will not be garbage-collected. So, use this for debugging only and remove from production code.
    * @param {string} [label]
    * @returns {EventStream<E, A>}
    */
  def log(): EventStream[E, A] = js.native
  def log(label: java.lang.String): EventStream[E, A] = js.native
  /**
    * @method
    * @description Maps [EventStream]{@link Bacon.EventStream} values using given `constant` value, returning a new EventStream. The `map` method, among many others, uses lazy evaluation.
    * @param {B} constant
    * @returns {EventStream<E, B>}
    * */
  def map[B](constant: B): EventStream[E, B] = js.native
  /**
    * @callback EventStream#map~f
    * @param {A} value
    * @returns {B}
    */
  /**
    * @method EventStream#map
    * @description Maps [EventStream]{@link Bacon.EventStream} values using given function `f`, returning a new EventStream. The `map` method, among many others, uses lazy evaluation.
    * @param {EventStream#map~f} f
    * @returns {EventStream<E, B>}
    * */
  def map[B](f: js.Function1[/* value */ A, B]): EventStream[E, B] = js.native
  /**
    * @method
    * @description Maps [EventStream]{@link Bacon.EventStream} values using given `propertyExtractor` string like ".keyCode", returning a new EventStream. So, if `propertyExtractor` is a string starting with a dot, the elements will be mapped to the corresponding field/function in the event value. For instance map(".keyCode") will pluck the keyCode field from the input values. If `keyCode` was a function, the result EventStream would contain the values returned by the function. The "Function Construction rules" apply here. The `map` method, among many others, uses lazy evaluation.
    * @param {string} propertyExtractor
    * @returns {EventStream<E, B>}
    * */
  def map[B](propertyExtractor: java.lang.String): EventStream[E, B] = js.native
  /**
    * @method
    * @description Maps [EventStream]{@link Bacon.EventStream} events to the current value of the given [Property]{@link Bacon.Property} `property`. This is equivalent to [Property.sampledBy]{@link Bacon.Property#sampledBy}.
    * @param {Property<E, B>} property
    * @returns {EventStream<E, B>}
    */
  def map[B](property: Property[E, B]): EventStream[E, B] = js.native
  /**
    * @callback EventStream#mapEnd~f
    * @returns {A}
    */
  /**
    * @method EventStream#mapEnd
    * @description Adds an extra [Next]{@link Bacon.Next} event just before [End]{@link Bacon.End} to [EventStream]{@link Bacon.EventStream}. The value is created by calling the given function `f` when the source [EventStream]{@link Bacon.EventStream} ends.
    * @param {EventStream#mapEnd~f} f
    * @returns {EventStream<E, A>}
    */
  def mapEnd(f: js.Function0[A]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Adds an extra [Next]{@link Bacon.Next} event just before [End]{@link Bacon.End} to [EventStream]{@link Bacon.EventStream}. A static `value` is used.
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def mapEnd(value: A): EventStream[E, A] = js.native
  /**
    * @callback EventStream#mapError~f
    * @param {E} error
    * @returns {B}
    */
  /**
    * @method EventStream#mapError
    * @description Maps [EventStream]{@link Bacon.EventStream} [Error]{@link Bacon.Error}s using given function `f`. More specifically, feeds the "error" field of the Error event to the function and produces a [Next]{@link Bacon.Next} event based on the return value. The "Function Construction rules" apply here.
    * @param {EventStream#mapError~f} f
    * @returns {EventStream<E, A|B>}
    */
  def mapError[B](f: js.Function1[/* error */ E, B]): EventStream[E, A | B] = js.native
  /**
    * @method
    * @description Merges two [EventStream]{@link Bacon.EventStream}s into one that delivers events from both.
    * @param {EventStream<E, A>} otherStream
    * @returns {EventStream<E, A>}
    */
  def merge(otherStream: EventStream[E, A]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Sets the name of the [EventStream]{@link Bacon.EventStream}. Overrides the default implementation of `toString` and `inspect`. Returns itself.
    * @param {string} newName
    * @returns {EventStream<E, A>}
    */
  def name(newName: java.lang.String): EventStream[E, A] = js.native
  /**
    * @method
    * @description Returns an [EventStream]{@link Bacon.EventStream} that inverts boolean values.
    * @returns {EventStream<E, boolean>}
    */
  def not(): EventStream[E, scala.Boolean] = js.native
  /**
    * @callback EventStream#onValues~f
    * @param {*[]} args
    * @returns {void}
    */
  /**
    * @callback EventStream#onValues~unsubscribe
    * @returns {void}
    */
  /**
    * @method EventStream#onValues
    * @description Subscribes a given handler function `f` to [EventStream]{@link Bacon.EventStream}. Like [EventStream.onValue]{@link Bacon.EventStream#onValue}, but splits the value (assuming its an array) as function arguments to `f`.
    * @param {EventStream#onValues~f} f
    * @returns {EventStream#onValues~unsubscribe}
    */
  def onValues(f: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function0[scala.Unit] = js.native
  /**
    * @method
    * @description Skips the first `n` elements from the [EventStream]{@link Bacon.EventStream}.
    * @param {number} n
    * @returns {EventStream<E, A>}
    */
  def skip(n: scala.Double): EventStream[E, A] = js.native
  /**
    * @callback EventStream#skipDuplicates~isEqual
    * @param {A} oldValue
    * @param {A} newValue
    * @returns {boolean}
    */
  /**
    * @method EventStream#skipDuplicates
    * @description Drops consecutive equal elements of the [EventStream]{@link Bacon.EventStream}. Uses the === operator for equality checking by default. If the `isEqual` argument is supplied, checks by calling [isEqual]{@link EventStream#skipDuplicates~isEqual}. For instance, to do a deep comparison, you can use the `isEqual` function from underscore.js like `stream.skipDuplicates(_.isEqual)`.
    * @param {EventStream#skipDuplicates~isEqual} [isEqual]
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromArray([1, 2, 2, 1]).skipDuplicates().log();
    * // > returns [1, 2, 1] in an order
    */
  def skipDuplicates(): EventStream[E, A] = js.native
  def skipDuplicates(isEqual: js.Function2[/* oldValue */ A, /* newValue */ A, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Skips all [Error]{@link Bacon.Error}s.
    * @returns {EventStream<E, A>}
    */
  def skipErrors(): EventStream[E, A] = js.native
  /**
    * @method
    * @description Skips elements from the [EventStream]{@link Bacon.EventStream} until a [Next]{@link Bacon.Next} event appears in `stream2`. In other words, starts delivering values from `stream` after first event appears in `stream2`.
    * @param {EventStream<E, B>} stream2
    * @returns {EventStream<E, A>}
    */
  def skipUntil[B](stream2: EventStream[E, B]): EventStream[E, A] = js.native
  /**
    * @callback EventStream#skipWhile~f
    * @param {A} value
    * @returns {boolean}
    */
  /**
    * @method EventStream#skipWhile
    * @description Skips elements in the [EventStream]{@link Bacon.EventStream} until the given predicate function `f` returns falsy once, and then lets all events pass through.
    * @param {EventStream#skipWhile~f} f
    * @returns {EventStream<E, A>}
    */
  def skipWhile(f: js.Function1[/* value */ A, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Skips elements in the [EventStream]{@link Bacon.EventStream} until the value of the given [Property]{@link Bacon.Property} `property` is falsy once, and then lets all events pass through.
    * @param {Property<E, B>} property
    * @returns {EventStream<E, A>}
    */
  def skipWhile[B](property: Property[E, B]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Adds a starting `value` to the [EventStream]{@link Bacon.EventStream}, i.e. concats a EventStream containing a single `value` with this EventStream.
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def startWith(value: A): EventStream[E, A] = js.native
  /**
    * @callback EventStream#subscribe~f
    * @param {Event<A>} event
    * @returns {void|NoMore}
    */
  /**
    * @callback EventStream#subscribe~unsubscribe
    * @returns {void}
    */
  /**
    * @method EventStream#subscribe
    * @description Subscribes a given handler function `f` to [EventStream]{@link Bacon.EventStream}. Function will receive [Event]{@link Bacon.Event} objects. The [subscribe]{@link EventStream#subscribe} call returns an [unsubscribe function]{@link EventStream#subscribe~unsubscribe} that you can call to unsubscribe. You can also unsubscribe by returning [Bacon.noMore]{@link Bacon.noMore} from the handler function as a reply to an Event.
    * @param {EventStream#subscribe~f} f
    * @returns {EventStream#subscribe~unsubscribe}
    */
  def subscribe(f: js.Function1[/* event */ Event[A], scala.Unit | NoMore]): js.Function0[scala.Unit] = js.native
  /**
    * @method
    * @description Takes at most n elements from the [EventStream]{@link Bacon.EventStream}. Equal to `Bacon.never()` if `n <= 0`.
    * @param {number} n
    * @returns {EventStream<E, A>}
    */
  def take(n: scala.Double): EventStream[E, A] = js.native
  /**
    * @method
    * @description Takes elements from [EventStream]{@link Bacon.EventStream} until a [Next]{@link Bacon.Next} event appears in the EventStream `stream`. If `stream` ends without value, it is ignored.
    * @param {EventStream<E, B>} stream
    * @returns {EventStream<E, A>}
    */
  def takeUntil[B](stream: EventStream[E, B]): EventStream[E, A] = js.native
  /**
    * @callback EventStream#takeWhile~f
    * @param {A} value
    * @returns {boolean}
    */
  /**
    * @method EventStream#takeWhile
    * @description Takes [EventStream]{@link Bacon.EventStream} values while given predicate function `f` holds `true`, and then ends.
    * @param {EventStream#takeWhile} f
    * @returns {EventStream<E, A>}
    */
  def takeWhile(f: js.Function1[/* value */ A, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method
    * @description Takes [EventStream]{@link Bacon.EventStream} values while the value of a `property` holds `true`, and then ends.
    * @param {Property<E, boolean>} property
    * @returns {EventStream<E, A>}
    */
  def takeWhile(property: Property[E, scala.Boolean]): EventStream[E, A] = js.native
  /**
    * @method EventStream#throttle
    * @description Throttles the [EventStream]{@link Bacon.EventStream} by given `delay` (in milliseconds). Events are emitted with the minimum interval of `delay`. The implementation is based on [EventStream.bufferWithTime]{@link Bacon.EventStream#bufferWithTime}.
    * @param {number} delay
    * @returns {EventStream<E, A>}
    */
  def throttle(delay: scala.Double): EventStream[E, A] = js.native
  /**
    * @method EventStream#toProperty
    * @description Creates a [Property]{@link Bacon.Property} based on the [EventStream]{@link Bacon.EventStream}. Without arguments, you'll get a Property without an initial value and will get its first actual value from the EventStream, and after that it'll always have a current value. Given `initialValue` will be used as the current value until the first value comes from the EventStream.
    * @param {A} [initialValue]
    * @returns {Property<E, A>}
    */
  def toProperty(): Property[E, A] = js.native
  def toProperty(initialValue: A): Property[E, A] = js.native
  /**
    * @method
    * @description Sets the structured description of the [EventStream]{@link Bacon.EventStream}. The `toString` and `inspect` methods use this data recursively to create a string representation for the `EventStream`. This method is probably useful for Bacon core/library/plugin development only.
    * @param {...*} param
    * @returns {EventStream<E, A>}
    * @example
    * {
    	 *     let src = Bacon.once(1),
    	 *         obs = src.map(x => -x);
    	 *
    	 *     console.log(obs.toString());
    	 *     // Bacon.once(1).map(function)
    	 *
    	 *     obs.withDescription(src, "times", -1);
    	 *     console.log(obs.toString());
    	 *     // Bacon.once(1).times(-1)
    	 */
  def withDescription(param: js.Any*): EventStream[E, A] = js.native
  /**
    * @callback EventStream#withHandler~f
    * @param {Initial<A>|Next<A>|End<A>|Error<E>} event
    * @returns {*}
    */
  /**
    * @method EventStream#withHandler
    * @description Lets you do more custom event handling on [EventStream]{@link Bacon.EventStream}: you get all events to your function `f` and you can output any number of events and end the stream if you choose. Note that it's important to return the value from `this.push` so that the connection to the underlying stream will be closed when no more events are needed.
    * @param {EventStream#withHandler~f} f
    * @returns {EventStream<E, A>}
    * @example
    * // Send an error and end the stream in case a value is below zero:
    * Bacon.fromArray([1, 2, -3, 3]).withHandler(function (event) {
    	 *     if (event.hasValue() && event.value() < 0) {
    	 *         this.push(new Bacon.Error("Value below zero"));
    	 *         return this.push(new Bacon.End());
    	 *     } else {
    	 *         return this.push(event);
    	 *     }
    	 * });
    */
  def withHandler(f: js.Function1[/* event */ Initial[A] | Next[A] | End[A] | Error[E], _]): EventStream[E, A] = js.native
}

@JSGlobal("Bacon.EventStream")
@js.native
class EventStreamCls[E, A] protected () extends EventStream[E, A] {
  /**
    * @callback EventStream#new~subscribe
    * @param {EventStream#new~sink} sink
    * @returns {EventStream#new~unsubscribe}
    */
  /**
    * @callback EventStream#new~sink
    * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
    * @returns {void}
    */
  /**
    * @callback EventStream#new~unsubscribe
    * @returns {void}
    */
  /**
    * @constructor EventStream#new
    * @constructs Bacon.EventStream
    * @description Creates an [EventStream]{@link Bacon.EventStream} with the given `subscribe` function.
    * @param {EventStream#new~subscribe} subscribe
    * @returns {EventStream<E, A>}
    */
  def this(subscribe: js.Function1[
      /* sink */ js.Function1[
        /* value */ More | NoMore | A | Initial[A] | Next[A] | End[A] | Error[E] | (js.Array[A | Initial[A] | Next[A] | End[A] | Error[E]]), 
        scala.Unit
      ], 
      js.Function0[scala.Unit]
    ]) = this()
}

@JSGlobal("Bacon.EventStream")
@js.native
object EventStream
  extends /**
  * @callback EventStream#new~subscribe
  * @param {EventStream#new~sink} sink
  * @returns {EventStream#new~unsubscribe}
  */
/**
  * @callback EventStream#new~sink
  * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
  * @returns {void}
  */
/**
  * @callback EventStream#new~unsubscribe
  * @returns {void}
  */
/**
  * @constructor EventStream#new
  * @constructs Bacon.EventStream
  * @description Creates an [EventStream]{@link Bacon.EventStream} with the given `subscribe` function.
  * @param {EventStream#new~subscribe} subscribe
  * @returns {EventStream<E, A>}
  */
org.scalablytyped.runtime.Instantiable1[
      /* subscribe */ js.Function1[
        /* sink */ js.Function1[
          /* value */ More | NoMore | js.Object | Initial[js.Object] | Next[js.Object] | End[js.Object] | Error[js.Object] | (js.Array[
            js.Object | Initial[js.Object] | Next[js.Object] | End[js.Object] | Error[js.Object]
          ]), 
          scala.Unit
        ], 
        js.Function0[scala.Unit]
      ], 
      EventStream[js.Object, js.Object]
    ]

