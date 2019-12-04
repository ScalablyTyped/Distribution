package typings.baseui.dndDashListMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArgT extends js.Object {
  @JSName("$isDragged")
  var $isDragged: Boolean
  @JSName("$isRemovable")
  var $isRemovable: Boolean
  @JSName("$isRemovableByMove")
  var $isRemovableByMove: Boolean
  @JSName("$isSelected")
  var $isSelected: Boolean
  @JSName("$value")
  var $value: ReactNode
}

object SharedStylePropsArgT {
  @scala.inline
  def apply(
    $isDragged: Boolean,
    $isRemovable: Boolean,
    $isRemovableByMove: Boolean,
    $isSelected: Boolean,
    $value: ReactNode = null
  ): SharedStylePropsArgT = {
    val __obj = js.Dynamic.literal($isDragged = $isDragged.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    if ($value != null) __obj.updateDynamic("$value")($value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgT]
  }
}

