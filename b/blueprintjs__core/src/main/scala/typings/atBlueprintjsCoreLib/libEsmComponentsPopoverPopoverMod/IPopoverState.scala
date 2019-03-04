package typings
package atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverState extends js.Object {
  var hasDarkParent: scala.Boolean
  var isOpen: scala.Boolean
  var transformOrigin: java.lang.String
}

object IPopoverState {
  @scala.inline
  def apply(hasDarkParent: scala.Boolean, isOpen: scala.Boolean, transformOrigin: java.lang.String): IPopoverState = {
    val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent, isOpen = isOpen, transformOrigin = transformOrigin)
  
    __obj.asInstanceOf[IPopoverState]
  }
}

