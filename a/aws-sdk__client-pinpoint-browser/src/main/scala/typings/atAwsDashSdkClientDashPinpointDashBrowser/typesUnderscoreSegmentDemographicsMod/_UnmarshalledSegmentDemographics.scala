package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDemographicsMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod._UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentDemographics extends _SegmentDemographics {
  /**
    * The app version criteria for the segment.
    */
  @JSName("AppVersion")
  var AppVersion__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The channel criteria for the segment.
    */
  @JSName("Channel")
  var Channel__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The device type criteria for the segment.
    */
  @JSName("DeviceType")
  var DeviceType__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The device make criteria for the segment.
    */
  @JSName("Make")
  var Make__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The device model criteria for the segment.
    */
  @JSName("Model")
  var Model__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The device platform criteria for the segment.
    */
  @JSName("Platform")
  var Platform__UnmarshalledSegmentDemographics: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
}

object _UnmarshalledSegmentDemographics {
  @scala.inline
  def apply(
    AppVersion: _UnmarshalledSetDimension = null,
    Channel: _UnmarshalledSetDimension = null,
    DeviceType: _UnmarshalledSetDimension = null,
    Make: _UnmarshalledSetDimension = null,
    Model: _UnmarshalledSetDimension = null,
    Platform: _UnmarshalledSetDimension = null
  ): _UnmarshalledSegmentDemographics = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentDemographics]
  }
}

