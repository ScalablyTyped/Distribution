package typings.blueprintjsCore.abstractButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonState extends js.Object {
  var isActive: Boolean
}

object IButtonState {
  @scala.inline
  def apply(isActive: Boolean): IButtonState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IButtonState]
  }
}

