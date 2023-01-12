package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPuckProps extends StObject {
  
  var confidenceRadius: js.UndefOr[Double] = js.undefined
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[LocationPuckOverrides] = js.undefined
  
  var showHeading: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[LocationPuckSize] = js.undefined
  
  var `type`: js.UndefOr[LocationPuckType] = js.undefined
}
object LocationPuckProps {
  
  inline def apply(): LocationPuckProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPuckProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationPuckProps] (val x: Self) extends AnyVal {
    
    inline def setConfidenceRadius(value: Double): Self = StObject.set(x, "confidenceRadius", value.asInstanceOf[js.Any])
    
    inline def setConfidenceRadiusUndefined: Self = StObject.set(x, "confidenceRadius", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setOverrides(value: LocationPuckOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setShowHeading(value: Boolean): Self = StObject.set(x, "showHeading", value.asInstanceOf[js.Any])
    
    inline def setShowHeadingUndefined: Self = StObject.set(x, "showHeading", js.undefined)
    
    inline def setSize(value: LocationPuckSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: LocationPuckType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
