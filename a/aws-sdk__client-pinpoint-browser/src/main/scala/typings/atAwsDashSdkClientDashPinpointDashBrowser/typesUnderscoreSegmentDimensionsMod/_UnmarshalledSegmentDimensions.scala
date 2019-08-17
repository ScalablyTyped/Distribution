package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAttributeDimensionMod._UnmarshalledAttributeDimension
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMetricDimensionMod._UnmarshalledMetricDimension
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentBehaviorsMod._UnmarshalledSegmentBehaviors
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDemographicsMod._UnmarshalledSegmentDemographics
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentLocationMod._UnmarshalledSegmentLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentDimensions extends _SegmentDimensions {
  /**
    * Custom segment attributes.
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[_UnmarshalledAttributeDimension]] = js.undefined
  /**
    * The segment behaviors attributes.
    */
  @JSName("Behavior")
  var Behavior__UnmarshalledSegmentDimensions: js.UndefOr[_UnmarshalledSegmentBehaviors] = js.undefined
  /**
    * The segment demographics attributes.
    */
  @JSName("Demographic")
  var Demographic__UnmarshalledSegmentDimensions: js.UndefOr[_UnmarshalledSegmentDemographics] = js.undefined
  /**
    * The segment location attributes.
    */
  @JSName("Location")
  var Location__UnmarshalledSegmentDimensions: js.UndefOr[_UnmarshalledSegmentLocation] = js.undefined
  /**
    * Custom segment metrics.
    */
  @JSName("Metrics")
  var Metrics__UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[_UnmarshalledMetricDimension]] = js.undefined
  /**
    * Custom segment user attributes.
    */
  @JSName("UserAttributes")
  var UserAttributes__UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[_UnmarshalledAttributeDimension]] = js.undefined
}

object _UnmarshalledSegmentDimensions {
  @scala.inline
  def apply(
    Attributes: StringDictionary[_UnmarshalledAttributeDimension] = null,
    Behavior: _UnmarshalledSegmentBehaviors = null,
    Demographic: _UnmarshalledSegmentDemographics = null,
    Location: _UnmarshalledSegmentLocation = null,
    Metrics: StringDictionary[_UnmarshalledMetricDimension] = null,
    UserAttributes: StringDictionary[_UnmarshalledAttributeDimension] = null
  ): _UnmarshalledSegmentDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Behavior != null) __obj.updateDynamic("Behavior")(Behavior)
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes)
    __obj.asInstanceOf[_UnmarshalledSegmentDimensions]
  }
}

