package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.never")
@js.native
object never extends js.Object {
  /**
    * @function Bacon.never
    * @description Creates an [EventStream]{@link Bacon.EventStream} that immediately ends.
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](): EventStream[E, A] = js.native
}

