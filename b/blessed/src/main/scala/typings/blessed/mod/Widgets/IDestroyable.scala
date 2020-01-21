package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDestroyable extends js.Object {
  def destroy(): Unit
}

object IDestroyable {
  @scala.inline
  def apply(destroy: () => Unit): IDestroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[IDestroyable]
  }
}

