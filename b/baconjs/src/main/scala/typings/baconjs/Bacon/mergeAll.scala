package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.mergeAll")
@js.native
object mergeAll extends js.Object {
  /**
    * @function
    * @description Merges given array of [EventStream]{@link Bacon.EventStream}s.
    * @param {...EventStream<E, A>} streams
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](streams: (EventStream[E, A])*): EventStream[E, A] = js.native
  /**
    * @function
    * @description Merges given array of [EventStream]{@link Bacon.EventStream}s.
    * @param {EventStream<E, A>[]} streams
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](streams: js.Array[EventStream[E, A]]): EventStream[E, A] = js.native
}

