package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDimensions extends StObject {
  
  /**
    * One or more custom attributes to use as criteria for the segment.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  
  /**
    * The behavior-based criteria, such as how recently users have used your app, for the segment.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
  
  /**
    * The demographic-based criteria, such as device platform, for the segment.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
  
  /**
    * The location-based criteria, such as region or GPS coordinates, for the segment.
    */
  var Location: js.UndefOr[SegmentLocation] = js.undefined
  
  /**
    * One or more custom metrics to use as criteria for the segment.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
  
  /**
    * One or more custom user attributes to use as criteria for the segment.
    */
  var UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
}
object SegmentDimensions {
  
  inline def apply(): SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDimensions]
  }
  
  extension [Self <: SegmentDimensions](x: Self) {
    
    inline def setAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBehavior(value: SegmentBehaviors): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "Behavior", js.undefined)
    
    inline def setDemographic(value: SegmentDemographics): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
    
    inline def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
    
    inline def setLocation(value: SegmentLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setMetrics(value: MapOfMetricDimension): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setUserAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
  }
}
