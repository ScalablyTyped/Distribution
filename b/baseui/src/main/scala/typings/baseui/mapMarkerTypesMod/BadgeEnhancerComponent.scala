package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeEnhancerComponent
  extends StObject
     with BadgeEnhancer {
  
  var markerType: PinHead
  
  var overrides: FixedMarkerOverrides
  
  var pinHeadSize: PinHeadSize
}
object BadgeEnhancerComponent {
  
  inline def apply(markerType: PinHead, overrides: FixedMarkerOverrides, pinHeadSize: PinHeadSize): BadgeEnhancerComponent = {
    val __obj = js.Dynamic.literal(markerType = markerType.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pinHeadSize = pinHeadSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeEnhancerComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadgeEnhancerComponent] (val x: Self) extends AnyVal {
    
    inline def setMarkerType(value: PinHead): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setPinHeadSize(value: PinHeadSize): Self = StObject.set(x, "pinHeadSize", value.asInstanceOf[js.Any])
  }
}
