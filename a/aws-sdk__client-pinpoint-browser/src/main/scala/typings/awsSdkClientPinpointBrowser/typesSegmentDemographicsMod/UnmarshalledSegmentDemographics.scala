package typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod

import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentDemographics extends SegmentDemographics {
  /**
    * The app version criteria for the segment.
    */
  @JSName("AppVersion")
  var AppVersion_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The channel criteria for the segment.
    */
  @JSName("Channel")
  var Channel_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The device type criteria for the segment.
    */
  @JSName("DeviceType")
  var DeviceType_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The device make criteria for the segment.
    */
  @JSName("Make")
  var Make_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The device model criteria for the segment.
    */
  @JSName("Model")
  var Model_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The device platform criteria for the segment.
    */
  @JSName("Platform")
  var Platform_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.undefined
}

object UnmarshalledSegmentDemographics {
  @scala.inline
  def apply(
    AppVersion: UnmarshalledSetDimension = null,
    Channel: UnmarshalledSetDimension = null,
    DeviceType: UnmarshalledSetDimension = null,
    Make: UnmarshalledSetDimension = null,
    Model: UnmarshalledSetDimension = null,
    Platform: UnmarshalledSetDimension = null
  ): UnmarshalledSegmentDemographics = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentDemographics]
  }
}

