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
import scala.scalajs.js.annotation._

trait SegmentDimensions extends js.Object {
  /**
    * Custom segment attributes.
    */
  var Attributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.undefined
  /**
    * The segment behaviors attributes.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
  /**
    * The segment demographics attributes.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
  /**
    * The segment location attributes.
    */
  var Location: js.UndefOr[SegmentLocation] = js.undefined
  /**
    * Custom segment metrics.
    */
  var Metrics: js.UndefOr[
    StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]])
  ] = js.undefined
  /**
    * Custom segment user attributes.
    */
  var UserAttributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.undefined
}

object SegmentDimensions {
  @scala.inline
  def apply(
    Attributes: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]]) = null,
    Behavior: SegmentBehaviors = null,
    Demographic: SegmentDemographics = null,
    Location: SegmentLocation = null,
    Metrics: StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]]) = null,
    UserAttributes: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]]) = null
  ): SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Behavior != null) __obj.updateDynamic("Behavior")(Behavior.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentDimensions]
  }
}

