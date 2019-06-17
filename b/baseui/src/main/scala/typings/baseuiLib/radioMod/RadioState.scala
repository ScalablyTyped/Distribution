package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioState extends js.Object {
  var isActive: scala.Boolean
  var isFocused: scala.Boolean
  var isHovered: scala.Boolean
}

object RadioState {
  @scala.inline
  def apply(isActive: scala.Boolean, isFocused: scala.Boolean, isHovered: scala.Boolean): RadioState = {
    val __obj = js.Dynamic.literal(isActive = isActive, isFocused = isFocused, isHovered = isHovered)
  
    __obj.asInstanceOf[RadioState]
  }
}

