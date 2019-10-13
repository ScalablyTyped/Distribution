package typings.cypress.typesBluebirdMod

import org.scalablytyped.runtime.Instantiable1
import typings.cypress.typesLodashMod._Global_.Map
import typings.std.Error
import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bluebird[R]
  extends PromiseLike[R]
     with Inspection[R] {
  /**
    * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def all[U](): Bluebird[js.Array[U]] = js.native
  /**
    * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def any[U](): Bluebird[U] = js.native
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
  def asCallback(sink: js.Any*): this.type = js.native
  /**
    * Create a promise that follows this promise, but is bound to the given `thisArg` value. A bound promise will call its handlers with the bound value set to `this`.
    *
    * Additionally promises derived from a bound promise will also be bound promises with the same `thisArg` binding as the original promise.
    */
  def bind(thisArg: js.Any): Bluebird[R] = js.native
  /**
    * This is a convenience method for doing:
    *
    * <code>
    * promise.then(function(obj){
    *     return obj[propertyName].call(obj, arg...);
    * });
    * </code>
    */
  def call(propertyName: String, args: js.Any*): Bluebird[_] = js.native
  /**
    * Cancel this `promise`. Will not do anything if this promise is already settled or if the cancellation feature has not been enabled
    */
  def cancel(): Unit = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def `catch`(onReject: js.Function1[/* error */ js.Any, R | js.Thenable[R]]): Bluebird[R] = js.native
  def `catch`[U](): Bluebird[U | R] = js.native
  def `catch`[E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]): Bluebird[R] = js.native
  def `catch`[E1](
    filter1: js.Function1[/* error */ E1, Boolean],
    onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def `catch`[E1, E2, E3, E4, E5](
    filter1: (js.Function1[/* error */ E1, Boolean]) | (E1 with js.Object),
    filter2: (js.Function1[/* error */ E2, Boolean]) | (E2 with js.Object),
    filter3: (js.Function1[/* error */ E3, Boolean]) | (E3 with js.Object),
    filter4: (js.Function1[/* error */ E4, Boolean]) | (E4 with js.Object),
    filter5: (js.Function1[/* error */ E5, Boolean]) | (E5 with js.Object),
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  /**
    * This extends `.catch` to work more like catch-clauses in languages like Java or C#.
    *
    * Instead of manually checking `instanceof` or `.name === "SomeError"`,
    * you may specify a number of error constructors which are eligible for this catch handler.
    * The catch handler that is first met that has eligible constructors specified, is the one that will be called.
    *
    * This method also supports predicate-based filters.
    * If you pass a predicate function instead of an error constructor, the predicate will receive the error as an argument.
    * The return result of the predicate will be used determine whether the error handler should be called.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def `catch`[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */, E5 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def catchReturn[U](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter5: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Function1[/* error */ js.Any, Boolean], filter2: js.Object, value: U): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: Instantiable1[/* args (repeated) */ js.Any, Error],
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Function1[/* error */ js.Any, Boolean], value: U): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Object, filter2: js.Function1[/* error */ js.Any, Boolean], value: U): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Object, filter2: js.Object, value: U): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Object, filter2: Instantiable1[/* args (repeated) */ js.Any, Error], value: U): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: js.Object, value: U): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: Instantiable1[/* args (repeated) */ js.Any, Error],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: Instantiable1[/* args (repeated) */ js.Any, Error], filter2: js.Object, value: U): Bluebird[R | U] = js.native
  def catchReturn[U](
    filter1: Instantiable1[/* args (repeated) */ js.Any, Error],
    filter2: Instantiable1[/* args (repeated) */ js.Any, Error],
    value: U
  ): Bluebird[R | U] = js.native
  def catchReturn[U](filter1: Instantiable1[/* args (repeated) */ js.Any, Error], value: U): Bluebird[R | U] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .catch(function() {
    *    return value;
    * });
    * </code>
    *
    * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.catchReturn()`
    */
  def catchReturn[U](value: U): Bluebird[R | U] = js.native
  def catchThrow(
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter5: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(
    filter1: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, Error]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(filter1: js.Function1[/* error */ js.Any, Boolean], filter2: js.Object, reason: Error): Bluebird[R] = js.native
  def catchThrow(
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: Instantiable1[/* args (repeated) */ js.Any, Error],
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(filter1: js.Function1[/* error */ js.Any, Boolean], reason: Error): Bluebird[R] = js.native
  def catchThrow(filter1: js.Object, filter2: js.Function1[/* error */ js.Any, Boolean], reason: Error): Bluebird[R] = js.native
  def catchThrow(filter1: js.Object, filter2: js.Object, reason: Error): Bluebird[R] = js.native
  def catchThrow(filter1: js.Object, filter2: Instantiable1[/* args (repeated) */ js.Any, Error], reason: Error): Bluebird[R] = js.native
  def catchThrow(filter1: js.Object, reason: Error): Bluebird[R] = js.native
  def catchThrow(
    filter1: Instantiable1[/* args (repeated) */ js.Any, Error],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(filter1: Instantiable1[/* args (repeated) */ js.Any, Error], filter2: js.Object, reason: Error): Bluebird[R] = js.native
  def catchThrow(
    filter1: Instantiable1[/* args (repeated) */ js.Any, Error],
    filter2: Instantiable1[/* args (repeated) */ js.Any, Error],
    reason: Error
  ): Bluebird[R] = js.native
  def catchThrow(filter1: Instantiable1[/* args (repeated) */ js.Any, Error], reason: Error): Bluebird[R] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .catch(function() {
    *    throw reason;
    * });
    * </code>
    * Same limitations apply as with `.catchReturn()`.
    */
  def catchThrow(reason: Error): Bluebird[R] = js.native
  @JSName("catch")
  def catch_U[U](onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1[U, E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1[U, E1](
    filter1: js.Function1[/* error */ E1, Boolean],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2[U, E1, E2](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2[U, E1, E2](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2[U, E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2[U, E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
    filter1: (js.Function1[/* error */ E1, Boolean]) | (E1 with js.Object),
    filter2: (js.Function1[/* error */ E2, Boolean]) | (E2 with js.Object),
    filter3: (js.Function1[/* error */ E3, Boolean]) | (E3 with js.Object),
    filter4: (js.Function1[/* error */ E4, Boolean]) | (E4 with js.Object),
    filter5: (js.Function1[/* error */ E5, Boolean]) | (E5 with js.Object),
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1_Error[U, E1 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1_ErrorE2_Error[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1_ErrorE2_ErrorE3_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1_ErrorE2_ErrorE3_ErrorE4_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("catch")
  def catch_UE1_ErrorE2_ErrorE3_ErrorE4_ErrorE5_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */, E5 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught(onReject: js.Function1[/* error */ js.Any, R | js.Thenable[R]]): Bluebird[R] = js.native
  def caught[U](): Bluebird[U | R] = js.native
  def caught[E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]): Bluebird[R] = js.native
  def caught[E1](
    filter1: js.Function1[/* error */ E1, Boolean],
    onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    onReject: js.Function1[/* error */ E1, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  def caught[E1, E2, E3, E4, E5](
    filter1: (js.Function1[/* error */ E1, Boolean]) | (E1 with js.Object),
    filter2: (js.Function1[/* error */ E2, Boolean]) | (E2 with js.Object),
    filter3: (js.Function1[/* error */ E3, Boolean]) | (E3 with js.Object),
    filter4: (js.Function1[/* error */ E4, Boolean]) | (E4 with js.Object),
    filter5: (js.Function1[/* error */ E5, Boolean]) | (E5 with js.Object),
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  /**
    * This extends `.catch` to work more like catch-clauses in languages like Java or C#.
    *
    * Instead of manually checking `instanceof` or `.name === "SomeError"`, you may specify a number of error constructors which are eligible for this catch handler.
    * The catch handler that is first met that has eligible constructors specified, is the one that will be called.
    *
    * This method also supports predicate-based filters. If you pass a predicate function instead of an error constructor, the predicate will receive the error as an argument.
    * The return result of the predicate will be used determine whether the error handler should be called.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */, E5 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSName("caught")
  def caught_U[U](onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1[U, E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1[U, E1](
    filter1: js.Function1[/* error */ E1, Boolean],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2[U, E1, E2](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2[U, E1, E2](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2[U, E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2[U, E1, E2](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3[U, E1, E2, E3](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: E1 with js.Object,
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: E2 with js.Object,
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: E3 with js.Object,
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: E4 with js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4[U, E1, E2, E3, E4](
    filter1: js.Function1[/* error */ E1, Boolean],
    filter2: js.Function1[/* error */ E2, Boolean],
    filter3: js.Function1[/* error */ E3, Boolean],
    filter4: js.Function1[/* error */ E4, Boolean],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
    filter1: (js.Function1[/* error */ E1, Boolean]) | (E1 with js.Object),
    filter2: (js.Function1[/* error */ E2, Boolean]) | (E2 with js.Object),
    filter3: (js.Function1[/* error */ E3, Boolean]) | (E3 with js.Object),
    filter4: (js.Function1[/* error */ E4, Boolean]) | (E4 with js.Object),
    filter5: (js.Function1[/* error */ E5, Boolean]) | (E5 with js.Object),
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1_Error[U, E1 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1_ErrorE2_Error[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1_ErrorE2_ErrorE3_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1_ErrorE2_ErrorE3_ErrorE4_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  @JSName("caught")
  def caught_UE1_ErrorE2_ErrorE3_ErrorE4_ErrorE5_Error[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */, E5 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
    filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
    filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
  ): Bluebird[U | R] = js.native
  /**
    * Same as calling `Promise.delay(ms, this)`.
    */
  def delay(ms: Double): Bluebird[R] = js.native
  /**
    * A meta method used to specify the disposer method that cleans up a resource when using `Promise.using`.
    *
    * Returns a Disposer object which encapsulates both the resource as well as the method to clean it up.
    *  The user can pass this object to `Promise.using` to get access to the resource when it becomes available,
    *  as well as to ensure its automatically cleaned up.
    *
    * The second argument passed to a disposer is the result promise of the using block, which you can
    *  inspect synchronously.
    */
  def disposer(disposeFn: js.Function2[/* arg */ R, /* promise */ Bluebird[R], Unit | js.Thenable[Unit]]): Disposer[R] = js.native
  /**
    * Like `.then()`, but any unhandled rejection that ends up here will be thrown as an error.
    */
  def done[U](): Unit = js.native
  def done[U](onFulfilled: js.Function1[/* value */ R, U | js.Thenable[U]]): Unit = js.native
  def done[U](
    onFulfilled: js.Function1[/* value */ R, U | js.Thenable[U]],
    onRejected: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
  ): Unit = js.native
  /**
    * Same as calling ``Bluebird.each(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def each[R, U](
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[R]] = js.native
  /**
    * Like `.catch` but instead of catching all types of exceptions, it only catches those that don't originate from thrown errors but rather from explicit rejections.
    */
  def error[U](onReject: js.Function1[/* reason */ js.Any, U | js.Thenable[U]]): Bluebird[U] = js.native
  /**
    * Same as calling ``Promise.filter(thisPromise, filterer)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def filter[U](
    filterer: js.Function3[
      /* item */ U, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ]
  ): Bluebird[js.Array[U]] = js.native
  def filter[U](
    filterer: js.Function3[
      /* item */ U, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  /**
    * Pass a handler that will be called regardless of this promise's fate. Returns a new promise chained from this promise.
    *
    * There are special semantics for `.finally()` in that the final value cannot be modified from the handler.
    *
    * Alias `.lastly();` for compatibility with earlier ECMAScript version.
    */
  def `finally`[U](handler: js.Function0[U | js.Thenable[U]]): Bluebird[R] = js.native
  /**
    * This is a convenience method for doing:
    *
    * <code>
    * promise.then(function(obj){
    *     return obj[propertyName];
    * });
    * </code>
    */
  def get[U /* <: String */](key: U): Bluebird[/* import warning: ImportType.apply Failed type conversion: R[U] */ js.Any] = js.native
  /**
    * See if this `promise` is resolved -> either fulfilled or rejected.
    */
  def isResolved(): Boolean = js.native
  def lastly[U](handler: js.Function0[U | js.Thenable[U]]): Bluebird[R] = js.native
  /**
    * Same as calling `Bluebird.map(thisPromise, mapper)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def map[Q, U](
    mapper: js.Function3[/* item */ Q, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  def map[Q, U](
    mapper: js.Function3[/* item */ Q, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  /**
    * Same as calling ``Bluebird.mapSeries(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def mapSeries[R, U](
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  /**
    * Register a node-style callback on this promise.
    *
    * When this promise is is either fulfilled or rejected,
    * the node callback will be called back with the node.js convention where error reason is the first argument and success value is the second argument.
    * The error argument will be `null` in case of success.
    * If the `callback` argument is not a function, this method does not do anything.
    */
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
  def nodeify(sink: js.Any*): this.type = js.native
  def props[T](`this`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
  /**
    * Same as calling `Promise.props(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("props")
  def props_KV[K, V](`this`: js.Thenable[Map[K, js.Thenable[V] | V]]): Bluebird[Map[K, V]] = js.native
  /**
    * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def race[U](): Bluebird[U] = js.native
  /**
    * Same as calling `Promise.reduce(thisPromise, Function reducer, initialValue)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def reduce[Q, U](
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ]
  ): Bluebird[U] = js.native
  def reduce[Q, U](
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ],
    initialValue: U
  ): Bluebird[U] = js.native
  /**
    * Synchronously inspect the state of this `promise`. The `PromiseInspection` will represent the state of
    * the promise as snapshotted at the time of calling `.reflect()`.
    */
  def reflect(): Bluebird[Inspection[R]] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .then(function() {
    *    return value;
    * });
    * </code>
    *
    * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.return()`
    *
    * Alias `.thenReturn();` for compatibility with earlier ECMAScript version.
    */
  def `return`(): Bluebird[Unit] = js.native
  def `return`[U](value: U): Bluebird[U] = js.native
  /**
    * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  // TODO type inference from array-resolving promise?
  def some[U](count: Double): Bluebird[js.Array[U]] = js.native
  def spread[U](fulfilledHandler: js.Function1[/* repeated */ js.Any, U | js.Thenable[U]]): Bluebird[U] = js.native
  /**
    * Like calling `.then`, but the fulfillment value or rejection reason is assumed to be an array, which is flattened to the formal parameters of the handlers.
    */
  @JSName("spread")
  def spread_UW[U, W](fulfilledHandler: js.Function1[/* repeated */ W, U | js.Thenable[U]]): Bluebird[U] = js.native
  /**
    * Basically sugar for doing: somePromise.catch(function(){});
    *
    * Which is needed in case error handlers are attached asynchronously to the promise later, which would otherwise result in premature unhandled rejection reporting.
    */
  def suppressUnhandledRejections(): Unit = js.native
  /**
    * Like `.finally()`, but not called for rejections.
    */
  def tap[U](onFulFill: js.Function1[/* value */ R, js.Thenable[U] | U]): Bluebird[R] = js.native
  /**
    * Like `.catch()` but rethrows the error
    */
  def tapCatch[U](onReject: js.Function1[/* error */ js.UndefOr[js.Any], U | js.Thenable[U]]): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */](filter1: js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Function1[/* error */ js.Any, Boolean],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Object,
    filter2: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Object,
    filter2: js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: js.Object,
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: js.Object,
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */](
    filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
    filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
    onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def tapCatch[U, E1 /* <: Error */, E2 /* <: Error */, E3 /* <: Error */, E4 /* <: Error */, E5 /* <: Error */](
    filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    filter5: (Instantiable1[/* args (repeated) */ js.Any, E5]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
  ): Bluebird[R] = js.native
  def thenReturn(): Bluebird[Unit] = js.native
  def thenReturn[U](value: U): Bluebird[U] = js.native
  def thenThrow(reason: Error): Bluebird[scala.Nothing] = js.native
   // For simpler signature help.
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ R, TResult1 | js.Thenable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ R, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Bluebird[TResult1 | TResult2] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .then(function() {
    *    throw reason;
    * });
    * </code>
    * Same limitations apply as with `.return()`.
    *
    * Alias `.thenThrow();` for compatibility with earlier ECMAScript version.
    */
  def `throw`(reason: Error): Bluebird[scala.Nothing] = js.native
  /**
    * Returns a promise that will be fulfilled with this promise's fulfillment value or rejection reason.
    *  However, if this promise is not fulfilled or rejected within ms milliseconds, the returned promise
    *  is rejected with a TimeoutError or the error as the reason.
    *
    * You may specify a custom error message with the `message` parameter.
    */
  def timeout(ms: Double): Bluebird[R] = js.native
  def timeout(ms: Double, message: String): Bluebird[R] = js.native
  def timeout(ms: Double, message: Error): Bluebird[R] = js.native
  /**
    * This is implicitly called by `JSON.stringify` when serializing the object. Returns a serialized representation of the `Promise`.
    */
  def toJSON(): js.Object = js.native
}

