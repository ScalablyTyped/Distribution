package typings.blessed.mod.Widgets.Events

import typings.blessed.mod.Widgets.Types.TMouseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventArg extends js.Object {
  var action: TMouseAction
  var x: Double
  var y: Double
}

object IMouseEventArg {
  @scala.inline
  def apply(action: TMouseAction, x: Double, y: Double): IMouseEventArg = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArg]
  }
}

