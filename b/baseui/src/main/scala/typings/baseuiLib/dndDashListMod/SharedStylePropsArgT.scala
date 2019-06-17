package typings
package baseuiLib.dndDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArgT extends js.Object {
  @JSName("$isDragged")
  var $isDragged: scala.Boolean
  @JSName("$isRemovable")
  var $isRemovable: scala.Boolean
  @JSName("$isSelected")
  var $isSelected: scala.Boolean
}

object SharedStylePropsArgT {
  @scala.inline
  def apply($isDragged: scala.Boolean, $isRemovable: scala.Boolean, $isSelected: scala.Boolean): SharedStylePropsArgT = {
    val __obj = js.Dynamic.literal($isDragged = $isDragged, $isRemovable = $isRemovable, $isSelected = $isSelected)
  
    __obj.asInstanceOf[SharedStylePropsArgT]
  }
}

