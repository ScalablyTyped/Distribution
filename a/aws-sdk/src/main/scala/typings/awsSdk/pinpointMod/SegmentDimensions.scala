package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDimensions extends StObject {
  
  /**
    * One or more custom attributes to use as criteria for the segment.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.native
  
  /**
    * The behavior-based criteria, such as how recently users have used your app, for the segment.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.native
  
  /**
    * The demographic-based criteria, such as device platform, for the segment.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.native
  
  /**
    * The location-based criteria, such as region or GPS coordinates, for the segment.
    */
  var Location: js.UndefOr[SegmentLocation] = js.native
  
  /**
    * One or more custom metrics to use as criteria for the segment.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.native
  
  /**
    * One or more custom user attributes to use as criteria for the segment.
    */
  var UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.native
}
object SegmentDimensions {
  
  @scala.inline
  def apply(): SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDimensions]
  }
  
  @scala.inline
  implicit class SegmentDimensionsMutableBuilder[Self <: SegmentDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setBehavior(value: SegmentBehaviors): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "Behavior", js.undefined)
    
    @scala.inline
    def setDemographic(value: SegmentDemographics): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
    
    @scala.inline
    def setLocation(value: SegmentLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfMetricDimension): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
  }
}
