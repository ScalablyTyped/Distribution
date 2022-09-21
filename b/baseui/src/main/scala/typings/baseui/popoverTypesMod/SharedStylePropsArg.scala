package typings.baseui.popoverTypesMod

import typings.baseui.layerTypesMod.TetherPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.baseui.popoverTypesMod.BodyStylePropsArg because var conflicts: $placement. Inlined $animationDuration, $isAnimating, $isHoverTrigger, $isOpen, $popoverOffset, $showArrow, $popoverMargin */ trait SharedStylePropsArg
  extends StObject
     with ArrowStylePropsArg {
  
  @JSName("$animationDuration")
  var $animationDuration: Double
  
  @JSName("$isAnimating")
  var $isAnimating: Boolean
  
  @JSName("$isHoverTrigger")
  var $isHoverTrigger: Boolean
  
  @JSName("$isOpen")
  var $isOpen: Boolean
  
  @JSName("$popoverMargin")
  var $popoverMargin: Double
  
  @JSName("$popoverOffset")
  var $popoverOffset: Offset
  
  @JSName("$showArrow")
  var $showArrow: Boolean
}
object SharedStylePropsArg {
  
  inline def apply(
    $animationDuration: Double,
    $arrowOffset: Offset,
    $isAnimating: Boolean,
    $isHoverTrigger: Boolean,
    $isOpen: Boolean,
    $placement: TetherPlacement,
    $popoverMargin: Double,
    $popoverOffset: Offset,
    $showArrow: Boolean
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal($animationDuration = $animationDuration.asInstanceOf[js.Any], $arrowOffset = $arrowOffset.asInstanceOf[js.Any], $isAnimating = $isAnimating.asInstanceOf[js.Any], $isHoverTrigger = $isHoverTrigger.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $popoverMargin = $popoverMargin.asInstanceOf[js.Any], $popoverOffset = $popoverOffset.asInstanceOf[js.Any], $showArrow = $showArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  
  extension [Self <: SharedStylePropsArg](x: Self) {
    
    inline def set$animationDuration(value: Double): Self = StObject.set(x, "$animationDuration", value.asInstanceOf[js.Any])
    
    inline def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
    
    inline def set$isHoverTrigger(value: Boolean): Self = StObject.set(x, "$isHoverTrigger", value.asInstanceOf[js.Any])
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
    
    inline def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
    
    inline def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
  }
}
