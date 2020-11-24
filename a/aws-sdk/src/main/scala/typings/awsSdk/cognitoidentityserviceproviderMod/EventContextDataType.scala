package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventContextDataType extends js.Object {
  
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.native
  
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.native
  
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.native
  
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.native
  
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.native
}
object EventContextDataType {
  
  @scala.inline
  def apply(): EventContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventContextDataType]
  }
  
  @scala.inline
  implicit class EventContextDataTypeOps[Self <: EventContextDataType] (val x: Self) extends AnyVal {
    
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
    def setCity(value: StringType): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCountry(value: StringType): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setDeviceName(value: StringType): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: StringType): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    
    @scala.inline
    def setTimezone(value: StringType): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
  }
}
