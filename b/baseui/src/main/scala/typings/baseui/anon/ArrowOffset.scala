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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowOffset extends StObject {
  
  var arrowOffset: Left
  
  var isAnimating: `false`
  
  var isLayerMounted: `false`
  
  var isMounted: `false`
  
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  
  var popoverOffset: Left
}
object ArrowOffset {
  
  inline def apply(
    arrowOffset: Left,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: Left
  ): ArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = false, isLayerMounted = false, isMounted = false, placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOffset]
  }
  
  extension [Self <: ArrowOffset](x: Self) {
    
    inline def setArrowOffset(value: Left): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
    
    inline def setIsAnimating(value: `false`): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    inline def setIsLayerMounted(value: `false`): Self = StObject.set(x, "isLayerMounted", value.asInstanceOf[js.Any])
    
    inline def setIsMounted(value: `false`): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopoverOffset(value: Left): Self = StObject.set(x, "popoverOffset", value.asInstanceOf[js.Any])
  }
}
