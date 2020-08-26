package typings.delay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearablePromise[T]
  extends js.Promise[T] {
  /**
  		Clears the delay and settles the promise.
  		*/
  def clear(): Unit = js.native
}

