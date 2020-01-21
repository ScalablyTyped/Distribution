package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceRequest extends js.Object {
  /**
    * A description of the device. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: String = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.native
  /**
    * The model of the device. Length Constraints: Maximum length of 128 characters.
    */
  var Model: js.UndefOr[String] = js.native
  /**
    * The serial number of the device. Length Constraints: Maximum length of 128 characters.
    */
  var SerialNumber: js.UndefOr[String] = js.native
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The type of the device.
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The vendor of the device. Length Constraints: Maximum length of 128 characters.
    */
  var Vendor: js.UndefOr[String] = js.native
}

object UpdateDeviceRequest {
  @scala.inline
  def apply(
    DeviceId: String,
    GlobalNetworkId: String,
    Description: String = null,
    Location: Location = null,
    Model: String = null,
    SerialNumber: String = null,
    SiteId: String = null,
    Type: String = null,
    Vendor: String = null
  ): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Vendor != null) __obj.updateDynamic("Vendor")(Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
}

