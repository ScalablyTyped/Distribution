package typings.baseui.anon

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
import typings.baseui.popoverMod.Offset
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children :react.react.ReactNode | undefined} */
trait SharedStylePropsArgchildrArrowOffset extends StObject {
  
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.undefined
  
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  
  @JSName("$popoverMargin")
  var $popoverMargin: js.UndefOr[Double] = js.undefined
  
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.undefined
  
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object SharedStylePropsArgchildrArrowOffset {
  
  inline def apply(): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
  
  extension [Self <: SharedStylePropsArgchildrArrowOffset](x: Self) {
    
    inline def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
    
    inline def set$arrowOffsetUndefined: Self = StObject.set(x, "$arrowOffset", js.undefined)
    
    inline def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
    
    inline def set$isAnimatingUndefined: Self = StObject.set(x, "$isAnimating", js.undefined)
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    inline def set$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    inline def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
    
    inline def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
    
    inline def set$popoverMarginUndefined: Self = StObject.set(x, "$popoverMargin", js.undefined)
    
    inline def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
    
    inline def set$popoverOffsetUndefined: Self = StObject.set(x, "$popoverOffset", js.undefined)
    
    inline def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
    
    inline def set$showArrowUndefined: Self = StObject.set(x, "$showArrow", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
