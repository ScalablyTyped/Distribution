package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPrivateState extends js.Object {
  var arrowOffset: Offset
  var isAnimating: scala.Boolean
  var isLayerMounted: scala.Boolean
  var isMounted: scala.Boolean
  var placement: baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right
  var popoverOffset: Offset
}

object PopoverPrivateState {
  @scala.inline
  def apply(
    arrowOffset: Offset,
    isAnimating: scala.Boolean,
    isLayerMounted: scala.Boolean,
    isMounted: scala.Boolean,
    placement: baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right,
    popoverOffset: Offset
  ): PopoverPrivateState = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset, isAnimating = isAnimating, isLayerMounted = isLayerMounted, isMounted = isMounted, placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset)
  
    __obj.asInstanceOf[PopoverPrivateState]
  }
}

