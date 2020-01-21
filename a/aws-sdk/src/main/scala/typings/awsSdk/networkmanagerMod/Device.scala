package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the device.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var DeviceArn: js.UndefOr[String] = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The site location.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.native
  /**
    * The device model.
    */
  var Model: js.UndefOr[String] = js.native
  /**
    * The device serial number.
    */
  var SerialNumber: js.UndefOr[String] = js.native
  /**
    * The site ID.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The device state.
    */
  var State: js.UndefOr[DeviceState] = js.native
  /**
    * The tags for the device.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The device type.
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The device vendor.
    */
  var Vendor: js.UndefOr[String] = js.native
}

object Device {
  @scala.inline
  def apply(
    CreatedAt: DateTime = null,
    Description: String = null,
    DeviceArn: String = null,
    DeviceId: String = null,
    GlobalNetworkId: String = null,
    Location: Location = null,
    Model: String = null,
    SerialNumber: String = null,
    SiteId: String = null,
    State: DeviceState = null,
    Tags: TagList = null,
    Type: String = null,
    Vendor: String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Vendor != null) __obj.updateDynamic("Vendor")(Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

