package typings.blessed.blessedMod.Widgets.Events

import typings.blessed.blessedMod.Widgets.Types.TMouseAction
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
    val __obj = js.Dynamic.literal(action = action, x = x, y = y)
  
    __obj.asInstanceOf[IMouseEventArg]
  }
}

