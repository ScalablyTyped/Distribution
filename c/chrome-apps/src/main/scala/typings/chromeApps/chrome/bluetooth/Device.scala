package typings.chromeApps.chrome.bluetooth

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String = js.native
  
  /**
    * Indicates whether the device is connectable.
    * @since Chrome 48
    */
  var connectable: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether the device is currently connected to the system. */
  var connected: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the device is currently connecting to the system.
    * @since Chrome 48
    */
  var connecting: js.UndefOr[Boolean] = js.native
  
  /** The class of the device, a bit-field defined by http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband. */
  var deviceClass: js.UndefOr[integer] = js.native
  
  var deviceId: js.UndefOr[integer] = js.native
  
  /**
    * The received signal strength, in dBm. This field is avaliable and valid only during discovery. Outside of discovery it's value is not specified.
    * @since Chrome 44
    */
  var inquiryRssi: integer = js.native
  
  /**
    * The transmitted power level. This field is avaliable only for LE devices that include this field in AD. It is avaliable and valid only during discovery.
    * @since Chrome 44
    */
  var inquiryTxPower: integer = js.native
  
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.native
  
  /** Indicates whether or not the device is paired with the system. */
  var paired: js.UndefOr[Boolean] = js.native
  
  var productId: js.UndefOr[integer] = js.native
  
  /**
    * The type of the device, if recognized by Chrome.
    * This is obtained from the |deviceClass| field and only represents a small fraction of the possible device types.
    * When in doubt you should use the |deviceClass| field directly.
    */
  var `type`: js.UndefOr[DeviceType] = js.native
  
  /**
    * UUIDs of protocols, profiles and services advertised by the device.
    * For classic Bluetooth devices, this list is obtained from EIR data and SDP tables.
    * For Low Energy devices, this list is obtained from AD and GATT primary services.
    * For dual mode devices this may be obtained from both.
    */
  var uuids: js.UndefOr[js.Array[String]] = js.native
  
  var vendorId: js.UndefOr[integer] = js.native
  
  /** The Device ID record of the device, where available. */
  var vendorIdSource: js.UndefOr[DeviceVendorIdSource] = js.native
}
object Device {
  
  @scala.inline
  def apply(address: String, inquiryRssi: integer, inquiryTxPower: integer): Device = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inquiryRssi = inquiryRssi.asInstanceOf[js.Any], inquiryTxPower = inquiryTxPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInquiryRssi(value: integer): Self = this.set("inquiryRssi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInquiryTxPower(value: integer): Self = this.set("inquiryTxPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectable(value: Boolean): Self = this.set("connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectable: Self = this.set("connectable", js.undefined)
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    
    @scala.inline
    def setConnecting(value: Boolean): Self = this.set("connecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnecting: Self = this.set("connecting", js.undefined)
    
    @scala.inline
    def setDeviceClass(value: integer): Self = this.set("deviceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceClass: Self = this.set("deviceClass", js.undefined)
    
    @scala.inline
    def setDeviceId(value: integer): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaired(value: Boolean): Self = this.set("paired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaired: Self = this.set("paired", js.undefined)
    
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setType(value: DeviceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = this.set("uuids", js.Array(value :_*))
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = this.set("uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuids: Self = this.set("uuids", js.undefined)
    
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
    
    @scala.inline
    def setVendorIdSource(value: DeviceVendorIdSource): Self = this.set("vendorIdSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorIdSource: Self = this.set("vendorIdSource", js.undefined)
  }
}
