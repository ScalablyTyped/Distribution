package typings.blessed.mod.Widgets.Events

import typings.blessed.mod.Widgets.Types.TMouseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseEventArg extends js.Object {
  var action: TMouseAction = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object IMouseEventArg {
  @scala.inline
  def apply(action: TMouseAction, x: Double, y: Double): IMouseEventArg = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArg]
  }
  @scala.inline
  implicit class IMouseEventArgOps[Self <: IMouseEventArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: TMouseAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

