package typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod

import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.SetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDemographics extends js.Object {
  /**
    * The app version criteria for the segment.
    */
  var AppVersion: js.UndefOr[SetDimension] = js.undefined
  /**
    * The channel criteria for the segment.
    */
  var Channel: js.UndefOr[SetDimension] = js.undefined
  /**
    * The device type criteria for the segment.
    */
  var DeviceType: js.UndefOr[SetDimension] = js.undefined
  /**
    * The device make criteria for the segment.
    */
  var Make: js.UndefOr[SetDimension] = js.undefined
  /**
    * The device model criteria for the segment.
    */
  var Model: js.UndefOr[SetDimension] = js.undefined
  /**
    * The device platform criteria for the segment.
    */
  var Platform: js.UndefOr[SetDimension] = js.undefined
}

object SegmentDemographics {
  @scala.inline
  def apply(
    AppVersion: SetDimension = null,
    Channel: SetDimension = null,
    DeviceType: SetDimension = null,
    Make: SetDimension = null,
    Model: SetDimension = null,
    Platform: SetDimension = null
  ): SegmentDemographics = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentDemographics]
  }
}

