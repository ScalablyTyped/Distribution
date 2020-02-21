package typings.baseui.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioState extends js.Object {
  var isActive: Boolean
  var isHovered: Boolean
}

object RadioState {
  @scala.inline
  def apply(isActive: Boolean, isHovered: Boolean): RadioState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RadioState]
  }
}

