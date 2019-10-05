package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Property
  * @augments Bacon.Observable
  * @description A reactive property. Has the concept of "current value". You can create a Property from an [EventStream]{@link Bacon.EventStream} by using either [EventStream.toProperty]{@link Bacon.EventStream#toProperty} or [Observable.scan]{@link Bacon.Observable#scan} method. Note: depending on how a Property is created, it may or may not have an initial value. The current value stays as its last value after the EventStream has ended.
  * */
@js.native
trait Property[E, A] extends Observable[E, A] {
  /**
    * @method
    * @description Combines [Property]{@link Bacon.Property}s with the && operator.
    * @param {Property<E, A>} other
    * @returns {Property<E, A>}
    */
  def and(other: Property[E, A]): Property[E, A] = js.native
  /**
    * @method Property#assign
    * @description Calls the `method` of the given `object` with each value of this [Property]{@link Bacon.Property}. You can optionally supply `params` which will be used as the first arguments of the `method` call. Note that the [assign]{@link Bacon.Property#assign} method is actually just a synonym for [onValue]{@link Bacon.Property#onValue}.
    * @param {Object} obj
    * @param {string} method
    * @param {...*} params
    * @returns {void}
    * @example
    * let property = Bacon.fromArray([1, 2, 3, 4, 5]).toProperty();
    * // If you want to assign your Property to the "disabled" attribute of a JQuery object, you can do this:
    * property.assign($("#my-button"), "attr", "disabled");
    * // A simpler example would be to toggle the visibility of an element based on a Property:
    * property.assign($("#my-button"), "toggle");
    */
  def assign(obj: js.Object, method: String, params: js.Any*): Unit = js.native
  /**
    * @method Property#changes
    * @description Returns an [EventStream]{@link Bacon.EventStream} of [Property]{@link Bacon.Property} value changes. Returns exactly the same events as the Property itself, except any [Initial]{@link Bacon.Initial} events (the stream DOES NOT include an event for the current value of the Property at the time this method was called). Note that [Property.changes]{@link Bacon.Property#changes} DOES NOT skip duplicate values, use [Property.skipDuplicates]{@link Bacon.Property#skipDuplicates} for that.
    * @returns {EventStream<E, A>}
    */
  def changes(): EventStream[E, A] = js.native
  /**
    * @method Property#debounce
    * @description Throttles the [Property]{@link Bacon.Property} by given `delay` (in milliseconds), but so that event is only emitted after the given "quiet period". Does not affect emitting the initial value of a Property. The difference of [throttle]{@link Bacon.Property#throttle} and [debounce]{@link Bacon.Property#debounce} is the same as it is in the same methods in jQuery.
    * @param {number} delay
    * @returns {Property<E, A>}
    */
  def debounce(delay: Double): Property[E, A] = js.native
  /**
    * @method
    * @description Passes the first event in the [Property]{@link Bacon.Property} through, but after that, only passes events after a given `delay` (in milliseconds) have passed since previous output.
    * @param {number} delay
    * @returns {Property<E, A>}
    */
  def debounceImmediate(delay: Double): Property[E, A] = js.native
  /**
    * @method
    * @description Delays the [Property]{@link Bacon.Property} by given `delay` (in milliseconds). Does not delay the initial value of a Property.
    * @param {number} delay
    * @returns {Property<E, A>}
    */
  def delay(delay: Double): Property[E, A] = js.native
  /**
    * @callback Property#doAction~f
    * @param {A} value
    * @returns {void}
    */
  /**
    * @method Property#doAction
    * @description Returns a [Property]{@link Bacon.Property} where the function `f` is executed for each value, before dispatching to subscribers. This is useful for debugging, but also for stuff like calling the `preventDefault()` method for events.
    * @param {Property#doAction~f} f
    * @returns {Property<E, A>}
    */
  def doAction(f: js.Function1[/* value */ A, Unit]): Property[E, A] = js.native
  /**
    * @method
    * @description Returns a [Property]{@link Bacon.Property} where the `propertyExtractor` string is applied to each value, before dispatching to subscribers. This is useful for debugging, but also for stuff like calling the `preventDefault()` method for events.
    * @param {string} propertyExtractor
    * @returns {Property<E, A>}
    */
  def doAction(propertyExtractor: String): Property[E, A] = js.native
  /**
    * @callback Property#doError~f
    * @param {E} error
    * @returns {void}
    */
  /**
    * @method Property#doError
    * @description Returns a [Property]{@link Bacon.Property} where the function `f` is executed for each error, before dispatching to subscribers. That is, same as [doAction]{@link Bacon.Property#doAction} but for [Error]{@link Bacon.Error}s.
    * @param {Property#doError~f} f
    * @returns {Property<E, A>}
    */
  def doError(f: js.Function1[/* error */ E, Unit]): Property[E, A] = js.native
  /**
    * @method Property#doLog
    * @description Logs each value of the [Property]{@link Bacon.Property} to the console. [doLog]{@link Bacon.Property#doLog} behaves like [log]{@link Bacon.Property#log} but does not subscribe to the Property. You can think of `doLog` as a logger function that – unlike `log` – is safe to use in production. `doLog` is safe, because it does not cause the same surprising side-effects as `log` does.
    * @param {string} [label]
    * @returns {Property<E, A>}
    */
  def doLog(): Property[E, A] = js.native
  def doLog(label: String): Property[E, A] = js.native
  /**
    * @method
    * @description Ends the [Property]{@link Bacon.Property} on first [Error]{@link Bacon.Error} event. The error is included in the output of the returned Property.
    * @returns {Property<E, A>}
    */
  def endOnError(): Property[E, A] = js.native
  /**
    * @callback Property#endOnError~f
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @method Property#endOnError
    * @description Ends the [Property]{@link Bacon.Property} on first [Error]{@link Bacon.Error} event for which the given predicate function `f` returns `true`. The error is included in the output of the returned Property.
    * @param {Property#endOnError~f} f
    * @returns {Property<E, A>}
    */
  def endOnError(f: js.Function1[/* error */ E, Boolean]): Property[E, A] = js.native
  /**
    * @method
    * @description Returns a [Property]{@link Bacon.Property} containing [Error]{@link Bacon.Error} events only. Same as filtering with a function that always returns false.
    * @returns {Property<E, A>}
    */
  def errors(): Property[E, A] = js.native
  /**
    * @method
    * @description Filters the [Property]{@link Bacon.Property} values using a given constant `bool` value (`true` to include all, `false` to exclude all).
    * @param {boolean} bool
    * @returns {Property<E, A>}
    */
  def filter(bool: Boolean): Property[E, A] = js.native
  /**
    * @callback Property#filter~f
    * @param {A} value
    * @returns {boolean}
    */
  /**
    * @method Property#filter
    * @description Filters the [Property]{@link Bacon.Property} values using a given predicate function `f`.
    * @param {Property#filter~f} f
    * @returns {Property<E, A>}
    */
  def filter(f: js.Function1[/* value */ A, Boolean]): Property[E, A] = js.native
  /**
    * @method
    * @description Filters the [Property]{@link Bacon.Property} values using a given `propertyExtractor` string (like ".isValuable").
    * @param {string} propertyExtractor
    * @returns {Property<E, A>}
    */
  def filter(propertyExtractor: String): Property[E, A] = js.native
  /**
    * @method
    * @description Filters the [Property]{@link Bacon.Property} values based on the value of the Property `property`. Event will be included in output IF AND ONLY IF the `property` holds `true` at the time of the event.
    * @param {Property<E, boolean>} property
    * @returns {Property<E, A>}
    */
  def filter(property: Property[E, Boolean]): Property[E, A] = js.native
  /**
    * @method
    * @description Takes the first element from the [Property]{@link Bacon.Property}. Essentially [Property.take]{@link Bacon.Property#take}(1).
    * @returns {Property<E, A>}
    */
  def first(): Property[E, A] = js.native
  /**
    * @method
    * @description Takes the last element from the [Property]{@link Bacon.Property}. None, if Property is empty.
    * @returns {Property<E, A>}
    * @example
    * // This creates the property which doesn't produce any events and never ends:
    * Bacon.interval(1e1, 0).toProperty().last();
    */
  def last(): Property[E, A] = js.native
  /**
    * @method Property#log
    * @description Logs each value of the [Property]{@link Bacon.Property} to the console. It optionally takes a `label` argument to pass to `console.log()` alongside each value. To assist with chaining, it returns the original Property. Note that as a side-effect, the Property will have a constant listener and will not be garbage-collected. So, use this for debugging only and remove from production code.
    * @param {string} [label]
    * @returns {Property<E, A>}
    */
  def log(): Property[E, A] = js.native
  def log(label: String): Property[E, A] = js.native
  /**
    * @method
    * @description Maps the [Property]{@link Bacon.Property} values using given `constant` value, returning a new Property. This method, among many others, uses lazy evaluation.
    * @param {B} constant
    * @returns {Property<E, B>}
    * */
  def map[B](constant: B): Property[E, B] = js.native
  /**
    * @callback Property#map~f
    * @param {A} value
    * @returns {B}
    */
  /**
    * @method Property#map
    * @description Maps the [Property]{@link Bacon.Property} values using given function `f`, returning a new Property. This method, among many others, uses lazy evaluation.
    * @param {Property#map~f} f
    * @returns {Property<E, B>}
    * */
  def map[B](f: js.Function1[/* value */ A, B]): Property[E, B] = js.native
  /**
    * @method
    * @description Maps the [Property]{@link Bacon.Property} values using given `propertyExtractor` string like ".keyCode", returning a new Property. So, if f is a string starting with a dot, the elements will be mapped to the corresponding field/function in the event value. For instance map(".keyCode") will pluck the keyCode field from the input values. If "keyCode" was a function, the resulting Property would contain the values returned by the function. This method, among many others, uses lazy evaluation.
    * @param {string} propertyExtractor
    * @returns {Property<E, B>}
    * */
  def map[B](propertyExtractor: String): Property[E, B] = js.native
  /**
    * @callback Property#mapEnd~f
    * @returns {A}
    */
  /**
    * @method Property#mapEnd
    * @description Adds an extra [Next]{@link Bacon.Next} event just before [End]{@link Bacon.End} of the [Property]{@link Bacon.Property}. The value is created by calling the given function `f` when the source Property ends.
    * @param {Property#mapEnd~f} f
    * @returns {Property<E, A>}
    */
  def mapEnd(f: js.Function0[A]): Property[E, A] = js.native
  /**
    * @method
    * @description Adds an extra [Next]{@link Bacon.Next} event just before [End]{@link Bacon.End} of the [Property]{@link Bacon.Property}. A static `value` is used.
    * @param {A} value
    * @returns {Property<E, A>}
    */
  def mapEnd(value: A): Property[E, A] = js.native
  /**
    * @callback Property#mapError~f
    * @param {E} error
    * @returns {B}
    */
  /**
    * @method Property#mapError
    * @description Maps the [Property]{@link Bacon.Property} errors using given function `f`. More specifically, feeds the "error" field of the [Error]{@link Bacon.Error} event to the function `f` and produces a [Next]{@link Bacon.Next} event based on the return value.
    * @param {Property#mapError~f} f
    * @returns {Property<E, A|B>}
    */
  def mapError[B](f: js.Function1[/* error */ E, B]): Property[E, A | B] = js.native
  /**
    * @method
    * @description Sets the `newName` of the [Property]{@link Bacon.Property}. Overrides the default implementation of `toString` and `inspect`. Returns itself.
    * @param {string} newName
    * @returns {Property<E, A>}
    */
  def name(newName: String): Property[E, A] = js.native
  /**
    * @method
    * @description Returns a [Property]{@link Bacon.Property} that inverts boolean values.
    * @returns {Property<E, boolean>}
    */
  def not(): Property[E, Boolean] = js.native
  /**
    * @callback Property#onValues~f
    * @param {*[]} args
    * @returns {void}
    */
  /**
    * @callback Property#onValues~unsubscribe
    * @returns {void}
    */
  /**
    * @method Property#onValues
    * @description Subscribes a handler function `f` to [Property]{@link Bacon.Property}. Like [onValue]{@link Bacon.Property#onValue}, but splits the value (assuming its an array) as function arguments to `f`.
    * @param {Property#onValues~f} f
    * @returns {Property#onValues~unsubscribe}
    */
  def onValues(f: js.Function1[/* repeated */ js.Any, Unit]): js.Function0[Unit] = js.native
  /**
    * @method
    * @description Combines [Property]{@link Bacon.Property}s with the || operator.
    * @param {Property<E, A>} other
    * @returns {Property<E, A>}
    */
  def or(other: Property[E, A]): Property[E, A] = js.native
  /**
    * @method
    * @description Creates an [EventStream]{@link Bacon.EventStream} by sampling the [Property]{@link Bacon.Property} value at given `interval` (in milliseconds).
    * @param {number} interval
    * @returns {EventStream<E, A>}
    */
  def sample(interval: Double): EventStream[E, A] = js.native
  /**
    * @method
    * @description Creates a [Property]{@link Bacon.Property} by sampling the value at each event from the given [Property]{@link Bacon.Property} `property`. The result Property will contain the value at each event in the source Property.
    * @param {Property<E, B>} property
    * @returns {Property<E, A>}
    */
  def sampledBy[B](property: Property[E, B]): Property[E, A] = js.native
  /**
    * @method Property#sampledBy
    * @description Creates an [EventStream]{@link Bacon.EventStream} by sampling the [Property]{@link Bacon.Property} value at each event from the given `stream`. The result EventStream will contain the value at each event in the source Property.
    * @param {EventStream<E, B>} stream
    * @returns {EventStream<E, A>}
    */
  def sampledBy[B](stream: EventStream[E, B]): EventStream[E, A] = js.native
  /**
    * @callback Property#sampledBy~f
    * @param {A} propertyValue
    * @param {B} samplerValue
    * @returns {C}
    */
  /**
    * @method Property#sampledBy
    * @description Samples the [Property]{@link Bacon.Property} on `streamOrProperty` events. The result values will be formed using the given function `f`.
    * @param {Observable<E, B>} streamOrProperty
    * @param {Property#sampledBy~f} f
    * @returns {EventStream<E, C>}
    */
  def sampledBy[B, C](
    streamOrProperty: Observable[E, B],
    f: js.Function2[/* propertyValue */ A, /* samplerValue */ B, C]
  ): EventStream[E, C] = js.native
  /**
    * @method
    * @description Skips the first `n` elements from the [Property]{@link Bacon.Property}.
    * @param {number} n
    * @returns {Property<E, A>}
    */
  def skip(n: Double): Property[E, A] = js.native
  /**
    * @callback Property#skipDuplicates~isEqual
    * @param {A} oldValue
    * @param {A} newValue
    * @returns {boolean}
    */
  /**
    * @method Property#skipDuplicates
    * @description Drops consecutive equal elements. Uses the `===` operator for equality checking by default. If the `isEqual` argument is supplied, checks by calling `isEqual(oldValue, newValue)`. The old name for this method was `distinctUntilChanged`.
    * @param {Property#skipDuplicates~isEqual} [isEqual]
    * @returns {Property<E, A>}
    */
  def skipDuplicates(): Property[E, A] = js.native
  def skipDuplicates(isEqual: js.Function2[/* oldValue */ A, /* newValue */ A, Boolean]): Property[E, A] = js.native
  /**
    * @method
    * @description Skips all [Error]{@link Bacon.Error}s.
    * @returns {Property<E, A>}
    */
  def skipErrors(): Property[E, A] = js.native
  /**
    * @method
    * @description Adds an initial "default" value for the [Property]{@link Bacon.Property}. If the Property doesn't have an initial value of it's own, the given `value` will be used as the initial value. If the property has an initial value of its own, the given `value` will be ignored.
    * @param {A} value
    * @returns {Property<E, A>}
    */
  def startWith(value: A): Property[E, A] = js.native
  /**
    * @callback Property#subscribe~f
    * @param {Event<A>} event
    * @returns {void}
    */
  /**
    * @callback Property#subscribe~unsubscribe
    * @returns {void}
    */
  /**
    * @method Property#subscribe
    * @description Subscribes a handler function `f` to [Property]{@link Bacon.Property}. If there's a current value, an [Initial]{@link Bacon.Initial} event will be pushed immediately. [Next]{@link Bacon.Next} event will be pushed on updates and an [End]{@link Bacon.End} event in case the source Property ends. Returns a function that you call to `unsubscribe`.
    * @param {Property#subscribe~f} f
    * @returns {Property#subscribe~unsubscribe}
    */
  def subscribe(f: js.Function1[/* event */ Event[A], Unit]): js.Function0[Unit] = js.native
  /**
    * @method Property#take
    * @description Takes at most `n` elements from the [Property]{@link Bacon.Property}. Equal to `Bacon.never()` if `n <= 0`.
    * @param {number} n
    * @returns {Property<E, A>}
    */
  def take(n: Double): Property[E, A] = js.native
  /**
    * @method
    * @description Takes elements from the [Property]{@link Bacon.Property} until a [Next]{@link Bacon.Next} event appears in the `stream`. If `stream` ends without value, it is ignored.
    * @param {EventStream<E, B>} stream
    * @returns {Property<E, A>}
    */
  def takeUntil[B](stream: EventStream[E, B]): Property[E, A] = js.native
  /**
    * @callback Property#takeWhile~f
    * @param {A} value
    * @returns {boolean}
    */
  /**
    * @method Property#takeWhile
    * @description Takes the [Property]{@link Bacon.Property} values while given predicate function `f` holds `true`, and then ends.
    * @param {Property#takeWhile~f} f
    * @returns {Property<E, A>}
    */
  def takeWhile(f: js.Function1[/* value */ A, Boolean]): Property[E, A] = js.native
  /**
    * @method
    * @description Takes the [Property]{@link Bacon.Property} values while the value of a `property` holds `true`, and then ends.
    * @param {Property<E, boolean>} property
    * @returns {Property<E, A>}
    */
  def takeWhile(property: Property[E, Boolean]): Property[E, A] = js.native
  /**
    * @method Property#throttle
    * @description Throttles the [Property]{@link Bacon.Property} by given `delay` (in milliseconds). Events are emitted with the minimum interval of `delay`. The implementation is based on [EventStream.bufferWithTime]{@link Bacon.EventStream#bufferWithTime}. Does not affect emitting the initial value of a Property.
    * @param {number} delay
    * @returns {Property<E, A>}
    */
  def throttle(delay: Double): Property[E, A] = js.native
  /**
    * @method
    * @description Creates an [EventStream]{@link Bacon.EventStream} based on this [Property]{@link Bacon.Property}. The EventStream contains also an event for the current value of this Property at the time this method was called.
    * @returns {EventStream<E, A>}
    */
  def toEventStream(): EventStream[E, A] = js.native
  /**
    * @method
    * @description Sets the structured description of the [Property]{@link Bacon.Property}. The `toString` and `inspect` methods use this data recursively to create a string representation for the Property. This method is probably useful for Bacon core/library/plugin development only.
    * @param {...*} param
    * @returns {Property<E, A>}
    * @example
    * let src = Bacon.once(1),
    *   obs = src.map(x => -x);
    *
    * console.log(obs.toString());
    * // Bacon.once(1).map(function)
    *
    * obs.withDescription(src, "times", -1);
    * console.log(obs.toString());
    * // Bacon.once(1).times(-1)
    */
  def withDescription(param: js.Any*): Property[E, A] = js.native
  /**
    * @callback Property#withHandler~f
    * @param {Initial<A>|Next<A>|End<A>|Error<E>} event
    * @returns {*}
    */
  /**
    * @method Property#withHandler
    * @description Lets you do more custom event handling on the [Property]{@link Bacon.Property}: you get all events to your function `f` and you can output any number of [Event]{@link Bacon.Event}s and end the Property if you choose. Note that it's important to return the value from `this.push` so that the connection to the underlying stream will be closed when no more events are needed.
    * @param {Property#withHandler~f} f
    * @returns {Property<E, A>}
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
  def withHandler(f: js.Function1[/* event */ Initial[A] | Next[A] | End[A] | Error[E], _]): Property[E, A] = js.native
}

