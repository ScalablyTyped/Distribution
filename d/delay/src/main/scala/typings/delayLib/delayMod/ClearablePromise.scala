package typings
package delayLib.delayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearablePromise[T]
  extends stdLib.Promise[T] {
  /**
  		Clears the delay and settles the promise.
  		*/
  def clear(): scala.Unit = js.native
}

