package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.anon.Data
import typings.chromeApps.anon.Uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertisement extends js.Object {
  
  /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
  var manufacturerData: js.UndefOr[Data] = js.native
  
  /** List of service data to be included in 'Service Data' fields of the advertising data. */
  var serviceData: Uuid = js.native
  
  /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.native
  
  /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var solicitUuids: js.UndefOr[js.Array[String]] = js.native
  
  /** Type of advertisement. */
  var `type`: AdvertisementType = js.native
}
object Advertisement {
  
  @scala.inline
  def apply(serviceData: Uuid, `type`: AdvertisementType): Advertisement = {
    val __obj = js.Dynamic.literal(serviceData = serviceData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertisement]
  }
  
  @scala.inline
  implicit class AdvertisementOps[Self <: Advertisement] (val x: Self) extends AnyVal {
    
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
    def setServiceData(value: Uuid): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AdvertisementType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerData(value: Data): Self = this.set("manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerData: Self = this.set("manufacturerData", js.undefined)
    
    @scala.inline
    def setServiceUuidsVarargs(value: String*): Self = this.set("serviceUuids", js.Array(value :_*))
    
    @scala.inline
    def setServiceUuids(value: js.Array[String]): Self = this.set("serviceUuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUuids: Self = this.set("serviceUuids", js.undefined)
    
    @scala.inline
    def setSolicitUuidsVarargs(value: String*): Self = this.set("solicitUuids", js.Array(value :_*))
    
    @scala.inline
    def setSolicitUuids(value: js.Array[String]): Self = this.set("solicitUuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolicitUuids: Self = this.set("solicitUuids", js.undefined)
  }
}
