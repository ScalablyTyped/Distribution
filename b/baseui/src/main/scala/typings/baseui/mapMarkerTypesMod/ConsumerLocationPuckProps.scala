package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerLocationPuckProps extends StObject {
  
  var confidenceRadius: js.UndefOr[Double] = js.undefined
  
  var heading: Double
  
  var overrides: LocationPuckOverrides
  
  var showHeading: js.UndefOr[Boolean] = js.undefined
}
object ConsumerLocationPuckProps {
  
  inline def apply(heading: Double, overrides: LocationPuckOverrides): ConsumerLocationPuckProps = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerLocationPuckProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerLocationPuckProps] (val x: Self) extends AnyVal {
    
    inline def setConfidenceRadius(value: Double): Self = StObject.set(x, "confidenceRadius", value.asInstanceOf[js.Any])
    
    inline def setConfidenceRadiusUndefined: Self = StObject.set(x, "confidenceRadius", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: LocationPuckOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setShowHeading(value: Boolean): Self = StObject.set(x, "showHeading", value.asInstanceOf[js.Any])
    
    inline def setShowHeadingUndefined: Self = StObject.set(x, "showHeading", js.undefined)
  }
}
