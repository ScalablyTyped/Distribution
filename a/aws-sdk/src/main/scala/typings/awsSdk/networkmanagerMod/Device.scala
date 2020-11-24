package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDeviceArn(value: String): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    
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
    def setState(value: DeviceState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
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
