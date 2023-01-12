package typings.baseui.anon

import typings.baseui.layerTypesMod.TetherPlacement
import typings.baseui.popoverTypesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover/types.BodyStylePropsArg & {  $theme :baseui.baseui/styles/types.Theme} */
trait BodyStylePropsArgthemeThe extends StObject {
  
  @JSName("$animationDuration")
  var $animationDuration: Double
  
  @JSName("$isAnimating")
  var $isAnimating: Boolean
  
  @JSName("$isHoverTrigger")
  var $isHoverTrigger: Boolean
  
  @JSName("$isOpen")
  var $isOpen: Boolean
  
  @JSName("$placement")
  var $placement: TetherPlacement
  
  @JSName("$popoverMargin")
  var $popoverMargin: Double
  
  @JSName("$popoverOffset")
  var $popoverOffset: Offset
  
  @JSName("$showArrow")
  var $showArrow: Boolean
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object BodyStylePropsArgthemeThe {
  
  inline def apply(
    $animationDuration: Double,
    $isAnimating: Boolean,
    $isHoverTrigger: Boolean,
    $isOpen: Boolean,
    $placement: TetherPlacement,
    $popoverMargin: Double,
    $popoverOffset: Offset,
    $showArrow: Boolean,
    $theme: typings.baseui.stylesTypesMod.Theme
  ): BodyStylePropsArgthemeThe = {
    val __obj = js.Dynamic.literal($animationDuration = $animationDuration.asInstanceOf[js.Any], $isAnimating = $isAnimating.asInstanceOf[js.Any], $isHoverTrigger = $isHoverTrigger.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $popoverMargin = $popoverMargin.asInstanceOf[js.Any], $popoverOffset = $popoverOffset.asInstanceOf[js.Any], $showArrow = $showArrow.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyStylePropsArgthemeThe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyStylePropsArgthemeThe] (val x: Self) extends AnyVal {
    
    inline def set$animationDuration(value: Double): Self = StObject.set(x, "$animationDuration", value.asInstanceOf[js.Any])
    
    inline def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
    
    inline def set$isHoverTrigger(value: Boolean): Self = StObject.set(x, "$isHoverTrigger", value.asInstanceOf[js.Any])
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$placement(value: TetherPlacement): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    inline def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
    
    inline def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
    
    inline def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
