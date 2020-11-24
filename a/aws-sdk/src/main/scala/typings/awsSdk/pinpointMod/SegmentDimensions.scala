package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDimensions extends js.Object {
  
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
  implicit class SegmentDimensionsOps[Self <: SegmentDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: MapOfAttributeDimension): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setBehavior(value: SegmentBehaviors): Self = this.set("Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("Behavior", js.undefined)
    
    @scala.inline
    def setDemographic(value: SegmentDemographics): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    
    @scala.inline
    def setLocation(value: SegmentLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfMetricDimension): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: MapOfAttributeDimension): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("UserAttributes", js.undefined)
  }
}
