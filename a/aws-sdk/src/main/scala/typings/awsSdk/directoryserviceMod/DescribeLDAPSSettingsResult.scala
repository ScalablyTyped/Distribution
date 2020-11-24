package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLDAPSSettingsResult extends js.Object {
  
  /**
    * Information about LDAP security for the specified directory, including status of enablement, state last updated date time, and the reason for the state.
    */
  var LDAPSSettingsInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.LDAPSSettingsInfo] = js.native
  
  /**
    * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is another page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object DescribeLDAPSSettingsResult {
  
  @scala.inline
  def apply(): DescribeLDAPSSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLDAPSSettingsResult]
  }
  
  @scala.inline
  implicit class DescribeLDAPSSettingsResultOps[Self <: DescribeLDAPSSettingsResult] (val x: Self) extends AnyVal {
    
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
    def setLDAPSSettingsInfoVarargs(value: LDAPSSettingInfo*): Self = this.set("LDAPSSettingsInfo", js.Array(value :_*))
    
    @scala.inline
    def setLDAPSSettingsInfo(value: LDAPSSettingsInfo): Self = this.set("LDAPSSettingsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLDAPSSettingsInfo: Self = this.set("LDAPSSettingsInfo", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
