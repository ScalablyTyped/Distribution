package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  /**
    * @function Bacon.once
    * @description Creates an [EventStream]{@link Bacon.EventStream} that delivers the given single `value` for the first subscriber. The stream will end immediately after this value. You can also send an [Error]{@link Bacon.Error} event instead of a `value`.
    * @param {A|Error<E>} value
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.once(new Bacon.Error("fail"));
    */
  def apply[E, A](value: A): EventStream[E, A] = js.native
  def apply[E, A](value: typings.baconjs.Bacon.Error[E]): EventStream[E, A] = js.native
}

