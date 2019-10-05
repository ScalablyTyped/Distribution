package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.zipWith")
@js.native
object zipWith extends js.Object {
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
  def apply[E, A, B](f: js.Function1[/* repeated */ A, B], streams: (EventStream[E, A])*): EventStream[E, B] = js.native
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
  def apply[E, A, B](streams: js.Array[EventStream[E, A]], f: js.Function1[/* repeated */ A, B]): EventStream[E, B] = js.native
}

