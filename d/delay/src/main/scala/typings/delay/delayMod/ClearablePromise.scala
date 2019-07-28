package typings.delay.delayMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearablePromise[T] extends Promise[T] {
  /**
  		Clears the delay and settles the promise.
  		*/
  def clear(): Unit = js.native
}

