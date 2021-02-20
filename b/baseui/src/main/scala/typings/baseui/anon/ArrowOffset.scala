package typings.baseui.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowOffset extends StObject {
  
  var arrowOffset: Left = js.native
  
  var isAnimating: `false` = js.native
  
  var isLayerMounted: `false` = js.native
  
  var isMounted: `false` = js.native
  
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = js.native
  
  var popoverOffset: Left = js.native
}
object ArrowOffset {
  
  @scala.inline
  def apply(
    arrowOffset: Left,
    isAnimating: `false`,
    isLayerMounted: `false`,
    isMounted: `false`,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: Left
  ): ArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOffset]
  }
  
  @scala.inline
  implicit class ArrowOffsetMutableBuilder[Self <: ArrowOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowOffset(value: Left): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnimating(value: `false`): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLayerMounted(value: `false`): Self = StObject.set(x, "isLayerMounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMounted(value: `false`): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverOffset(value: Left): Self = StObject.set(x, "popoverOffset", value.asInstanceOf[js.Any])
  }
}
