package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.zipAsArray")
@js.native
object zipAsArray extends js.Object {
  /**
    * @function
    * @description Zips the `streams` in to a new [EventStream]{@link Bacon.EventStream} that will have an array of values from each source EventStream as its value. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. EventStream's are provided as a list of arguments as opposed to a single array. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {...EventStream<E, A>} streams
    * @returns {EventStream<E, A[]>}
    */
  def apply[E, A](streams: (EventStream[E, A])*): EventStream[E, js.Array[A]] = js.native
  /**
    * @function
    * @description Zips the array of `streams` in to a new [EventStream]{@link Bacon.EventStream} that will have an array of values from each source EventStream as its value. Zipping means that events from each EventStream are combine pairwise so that the 1st event from each EventStream is published first, then the 2nd event from each. The results will be published as soon as there is a value from each source EventStream. Be careful not to have too much "drift" between EventStream's. If one EventStream produces many more values than some other excessive buffering will occur inside the zipped [Observable]{@link Bacon.Observable}.
    * @param {EventStream<E, A>[]} streams
    * @returns {EventStream<E, A[]>}
    */
  def apply[E, A](streams: js.Array[EventStream[E, A]]): EventStream[E, js.Array[A]] = js.native
}

