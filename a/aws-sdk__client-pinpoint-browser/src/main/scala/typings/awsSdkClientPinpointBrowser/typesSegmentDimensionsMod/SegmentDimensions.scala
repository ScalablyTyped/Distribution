package typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.AttributeDimension
import typings.awsSdkClientPinpointBrowser.typesMetricDimensionMod.MetricDimension
import typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.SegmentBehaviors
import typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.SegmentDemographics
import typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod.SegmentLocation
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDimensions extends js.Object {
  
  /**
    * Custom segment attributes.
    */
  var Attributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.native
  
  /**
    * The segment behaviors attributes.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.native
  
  /**
    * The segment demographics attributes.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.native
  
  /**
    * The segment location attributes.
    */
  var Location: js.UndefOr[SegmentLocation] = js.native
  
  /**
    * Custom segment metrics.
    */
  var Metrics: js.UndefOr[
    StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]])
  ] = js.native
  
  /**
    * Custom segment user attributes.
    */
  var UserAttributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.native
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
    def setAttributes(value: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
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
    def setMetrics(value: StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]])): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("UserAttributes", js.undefined)
  }
}
