package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PciId extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the subsystem.
    */
  var SubsystemId: js.UndefOr[String] = js.native
  /**
    * The ID of the vendor for the subsystem.
    */
  var SubsystemVendorId: js.UndefOr[String] = js.native
  /**
    * The ID of the vendor.
    */
  var VendorId: js.UndefOr[String] = js.native
}

object PciId {
  @scala.inline
  def apply(
    DeviceId: String = null,
    SubsystemId: String = null,
    SubsystemVendorId: String = null,
    VendorId: String = null
  ): PciId = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (SubsystemId != null) __obj.updateDynamic("SubsystemId")(SubsystemId.asInstanceOf[js.Any])
    if (SubsystemVendorId != null) __obj.updateDynamic("SubsystemVendorId")(SubsystemVendorId.asInstanceOf[js.Any])
    if (VendorId != null) __obj.updateDynamic("VendorId")(VendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PciId]
  }
}

