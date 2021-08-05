package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  var draggingCursor: js.UndefOr[String] = js.undefined
  
  var enableClicking: js.UndefOr[Boolean] = js.undefined
  
  var enableDragging: js.UndefOr[Boolean] = js.undefined
  
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Icon] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var shadow: js.UndefOr[Icon] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MarkerOptions {
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  extension [Self <: MarkerOptions](x: Self) {
    
    inline def setDraggingCursor(value: String): Self = StObject.set(x, "draggingCursor", value.asInstanceOf[js.Any])
    
    inline def setDraggingCursorUndefined: Self = StObject.set(x, "draggingCursor", js.undefined)
    
    inline def setEnableClicking(value: Boolean): Self = StObject.set(x, "enableClicking", value.asInstanceOf[js.Any])
    
    inline def setEnableClickingUndefined: Self = StObject.set(x, "enableClicking", js.undefined)
    
    inline def setEnableDragging(value: Boolean): Self = StObject.set(x, "enableDragging", value.asInstanceOf[js.Any])
    
    inline def setEnableDraggingUndefined: Self = StObject.set(x, "enableDragging", js.undefined)
    
    inline def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    inline def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRaiseOnDrag(value: Boolean): Self = StObject.set(x, "raiseOnDrag", value.asInstanceOf[js.Any])
    
    inline def setRaiseOnDragUndefined: Self = StObject.set(x, "raiseOnDrag", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setShadow(value: Icon): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
