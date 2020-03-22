package typings.baseui

import typings.baseui.baseuiBooleans.`false`
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrowOffset extends js.Object {
  var arrowOffset: AnonLeft
  var isAnimating: `false`
  var isLayerMounted: `false`
  var isMounted: `false`
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  var popoverOffset: AnonLeft
}

object AnonArrowOffset {
  @scala.inline
  def apply(
    arrowOffset: AnonLeft,
    isAnimating: `false`,
    isLayerMounted: `false`,
    isMounted: `false`,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: AnonLeft
  ): AnonArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrowOffset]
  }
}

