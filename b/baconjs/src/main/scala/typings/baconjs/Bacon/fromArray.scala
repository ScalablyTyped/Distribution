package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.fromArray")
@js.native
object fromArray extends js.Object {
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} that delivers the given series of `values` (given as array) to the first subscriber. The stream ends after these values have been delivered. You can also send [Error]{@link Bacon.Error} events, or any combination of pure values and error events.
    * @param {(A|Error<E>)[]} values
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromArray([1, new Bacon.Error("")]);
    */
  def apply[E, A](values: js.Array[A | Error[E]]): EventStream[E, A] = js.native
}

