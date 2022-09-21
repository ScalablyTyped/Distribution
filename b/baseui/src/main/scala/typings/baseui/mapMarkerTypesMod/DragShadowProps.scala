package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragShadowProps extends StObject {
  
  var background: String
  
  var dragging: Boolean
  
  var height: Double
  
  var overrides: FixedMarkerOverrides
}
object DragShadowProps {
  
  inline def apply(background: String, dragging: Boolean, height: Double, overrides: FixedMarkerOverrides): DragShadowProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragShadowProps]
  }
  
  extension [Self <: DragShadowProps](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
  }
}
