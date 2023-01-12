package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EarnerLocationPuckProps extends StObject {
  
  var confidenceRadius: js.UndefOr[Double] = js.undefined
  
  var heading: Double
  
  var overrides: js.UndefOr[LocationPuckOverrides] = js.undefined
  
  var size: LocationPuckSize
}
object EarnerLocationPuckProps {
  
  inline def apply(heading: Double, size: LocationPuckSize): EarnerLocationPuckProps = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarnerLocationPuckProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EarnerLocationPuckProps] (val x: Self) extends AnyVal {
    
    inline def setConfidenceRadius(value: Double): Self = StObject.set(x, "confidenceRadius", value.asInstanceOf[js.Any])
    
    inline def setConfidenceRadiusUndefined: Self = StObject.set(x, "confidenceRadius", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: LocationPuckOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: LocationPuckSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
