package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisposable extends js.Object {
  /**
    * Releases all held resources
    */
  def dispose(): Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: () => Unit): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IDisposable]
  }
}

