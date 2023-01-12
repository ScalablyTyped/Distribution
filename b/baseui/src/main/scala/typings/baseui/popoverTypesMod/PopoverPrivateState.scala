package typings.baseui.popoverTypesMod

import typings.baseui.layerTypesMod.TetherPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverPrivateState extends StObject {
  
  var arrowOffset: Offset
  
  var autoFocusAfterPositioning: Boolean
  
  var isAnimating: Boolean
  
  var isLayerMounted: Boolean
  
  var isMounted: Boolean
  
  var placement: TetherPlacement
  
  var popoverOffset: Offset
}
object PopoverPrivateState {
  
  inline def apply(
    arrowOffset: Offset,
    autoFocusAfterPositioning: Boolean,
    isAnimating: Boolean,
    isLayerMounted: Boolean,
    isMounted: Boolean,
    placement: TetherPlacement,
    popoverOffset: Offset
  ): PopoverPrivateState = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], autoFocusAfterPositioning = autoFocusAfterPositioning.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverPrivateState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverPrivateState] (val x: Self) extends AnyVal {
    
    inline def setArrowOffset(value: Offset): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusAfterPositioning(value: Boolean): Self = StObject.set(x, "autoFocusAfterPositioning", value.asInstanceOf[js.Any])
    
    inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    inline def setIsLayerMounted(value: Boolean): Self = StObject.set(x, "isLayerMounted", value.asInstanceOf[js.Any])
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: TetherPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopoverOffset(value: Offset): Self = StObject.set(x, "popoverOffset", value.asInstanceOf[js.Any])
  }
}
