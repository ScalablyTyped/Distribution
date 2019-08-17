package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAttributeDimensionMod._AttributeDimension
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMetricDimensionMod._MetricDimension
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentBehaviorsMod._SegmentBehaviors
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDemographicsMod._SegmentDemographics
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentLocationMod._SegmentLocation
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentDimensions extends js.Object {
  /**
    * Custom segment attributes.
    */
  var Attributes: js.UndefOr[
    StringDictionary[_AttributeDimension] | (Iterable[js.Tuple2[String, _AttributeDimension]])
  ] = js.undefined
  /**
    * The segment behaviors attributes.
    */
  var Behavior: js.UndefOr[_SegmentBehaviors] = js.undefined
  /**
    * The segment demographics attributes.
    */
  var Demographic: js.UndefOr[_SegmentDemographics] = js.undefined
  /**
    * The segment location attributes.
    */
  var Location: js.UndefOr[_SegmentLocation] = js.undefined
  /**
    * Custom segment metrics.
    */
  var Metrics: js.UndefOr[
    StringDictionary[_MetricDimension] | (Iterable[js.Tuple2[String, _MetricDimension]])
  ] = js.undefined
  /**
    * Custom segment user attributes.
    */
  var UserAttributes: js.UndefOr[
    StringDictionary[_AttributeDimension] | (Iterable[js.Tuple2[String, _AttributeDimension]])
  ] = js.undefined
}

object _SegmentDimensions {
  @scala.inline
  def apply(
    Attributes: StringDictionary[_AttributeDimension] | (Iterable[js.Tuple2[String, _AttributeDimension]]) = null,
    Behavior: _SegmentBehaviors = null,
    Demographic: _SegmentDemographics = null,
    Location: _SegmentLocation = null,
    Metrics: StringDictionary[_MetricDimension] | (Iterable[js.Tuple2[String, _MetricDimension]]) = null,
    UserAttributes: StringDictionary[_AttributeDimension] | (Iterable[js.Tuple2[String, _AttributeDimension]]) = null
  ): _SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Behavior != null) __obj.updateDynamic("Behavior")(Behavior)
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentDimensions]
  }
}

