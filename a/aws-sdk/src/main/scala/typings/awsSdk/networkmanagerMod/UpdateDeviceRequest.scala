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
  def apply(DeviceId: String, GlobalNetworkId: String): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
  @scala.inline
  implicit class UpdateDeviceRequestOps[Self <: UpdateDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("SerialNumber", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("SiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("SiteId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("Vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("Vendor", js.undefined)
  }
  
}

