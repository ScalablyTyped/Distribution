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

trait Anon_ArrowOffset extends js.Object {
  var arrowOffset: Anon_0
  var isAnimating: `false`
  var isLayerMounted: `false`
  var isMounted: `false`
  var placement: rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right
  var popoverOffset: Anon_0
}

object Anon_ArrowOffset {
  @scala.inline
  def apply(
    arrowOffset: Anon_0,
    isAnimating: `false`,
    isLayerMounted: `false`,
    isMounted: `false`,
    placement: rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right,
    popoverOffset: Anon_0
  ): Anon_ArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArrowOffset]
  }
}

