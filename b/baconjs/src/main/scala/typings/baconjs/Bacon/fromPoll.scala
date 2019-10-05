package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.fromPoll")
@js.native
object fromPoll extends js.Object {
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
  def apply[E, A](interval: Double, f: js.Function0[Next[A] | End[A]]): EventStream[E, A] = js.native
}

