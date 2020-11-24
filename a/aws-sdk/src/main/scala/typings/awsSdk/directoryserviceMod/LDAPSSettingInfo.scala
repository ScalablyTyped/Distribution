package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDAPSSettingInfo extends js.Object {
  
  /**
    * The state of the LDAPS settings.
    */
  var LDAPSStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.LDAPSStatus] = js.native
  
  /**
    * Describes a state change for LDAPS.
    */
  var LDAPSStatusReason: js.UndefOr[typings.awsSdk.directoryserviceMod.LDAPSStatusReason] = js.native
  
  /**
    * The date and time when the LDAPS settings were last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
}
object LDAPSSettingInfo {
  
  @scala.inline
  def apply(): LDAPSSettingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDAPSSettingInfo]
  }
  
  @scala.inline
  implicit class LDAPSSettingInfoOps[Self <: LDAPSSettingInfo] (val x: Self) extends AnyVal {
    
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
    def setLDAPSStatus(value: LDAPSStatus): Self = this.set("LDAPSStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLDAPSStatus: Self = this.set("LDAPSStatus", js.undefined)
    
    @scala.inline
    def setLDAPSStatusReason(value: LDAPSStatusReason): Self = this.set("LDAPSStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLDAPSStatusReason: Self = this.set("LDAPSStatusReason", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("LastUpdatedDateTime", js.undefined)
  }
}
