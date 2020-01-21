package typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.UnmarshalledAttributeDimension
import typings.awsSdkClientPinpointBrowser.typesMetricDimensionMod.UnmarshalledMetricDimension
import typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.UnmarshalledSegmentBehaviors
import typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.UnmarshalledSegmentDemographics
import typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod.UnmarshalledSegmentLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentDimensions extends SegmentDimensions {
  /**
    * Custom segment attributes.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.undefined
  /**
    * The segment behaviors attributes.
    */
  @JSName("Behavior")
  var Behavior_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentBehaviors] = js.undefined
  /**
    * The segment demographics attributes.
    */
  @JSName("Demographic")
  var Demographic_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentDemographics] = js.undefined
  /**
    * The segment location attributes.
    */
  @JSName("Location")
  var Location_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentLocation] = js.undefined
  /**
    * Custom segment metrics.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledMetricDimension]] = js.undefined
  /**
    * Custom segment user attributes.
    */
  @JSName("UserAttributes")
  var UserAttributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.undefined
}

object UnmarshalledSegmentDimensions {
  @scala.inline
  def apply(
    Attributes: StringDictionary[UnmarshalledAttributeDimension] = null,
    Behavior: UnmarshalledSegmentBehaviors = null,
    Demographic: UnmarshalledSegmentDemographics = null,
    Location: UnmarshalledSegmentLocation = null,
    Metrics: StringDictionary[UnmarshalledMetricDimension] = null,
    UserAttributes: StringDictionary[UnmarshalledAttributeDimension] = null
  ): UnmarshalledSegmentDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Behavior != null) __obj.updateDynamic("Behavior")(Behavior.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentDimensions]
  }
}

