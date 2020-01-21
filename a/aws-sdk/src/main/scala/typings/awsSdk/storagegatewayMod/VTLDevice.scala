package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VTLDevice extends js.Object {
  /**
    * A list of iSCSI information about a VTL device.
    */
  var DeviceiSCSIAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.DeviceiSCSIAttributes] = js.native
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
  /**
    * Specifies the model number of device that the VTL device emulates.
    */
  var VTLDeviceProductIdentifier: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceProductIdentifier] = js.native
  /**
    * Specifies the type of device that the VTL device emulates.
    */
  var VTLDeviceType: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceType] = js.native
  /**
    * Specifies the vendor of the device that the VTL device object emulates.
    */
  var VTLDeviceVendor: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceVendor] = js.native
}

object VTLDevice {
  @scala.inline
  def apply(
    DeviceiSCSIAttributes: DeviceiSCSIAttributes = null,
    VTLDeviceARN: VTLDeviceARN = null,
    VTLDeviceProductIdentifier: VTLDeviceProductIdentifier = null,
    VTLDeviceType: VTLDeviceType = null,
    VTLDeviceVendor: VTLDeviceVendor = null
  ): VTLDevice = {
    val __obj = js.Dynamic.literal()
    if (DeviceiSCSIAttributes != null) __obj.updateDynamic("DeviceiSCSIAttributes")(DeviceiSCSIAttributes.asInstanceOf[js.Any])
    if (VTLDeviceARN != null) __obj.updateDynamic("VTLDeviceARN")(VTLDeviceARN.asInstanceOf[js.Any])
    if (VTLDeviceProductIdentifier != null) __obj.updateDynamic("VTLDeviceProductIdentifier")(VTLDeviceProductIdentifier.asInstanceOf[js.Any])
    if (VTLDeviceType != null) __obj.updateDynamic("VTLDeviceType")(VTLDeviceType.asInstanceOf[js.Any])
    if (VTLDeviceVendor != null) __obj.updateDynamic("VTLDeviceVendor")(VTLDeviceVendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTLDevice]
  }
}

