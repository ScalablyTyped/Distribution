package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsageForLicenseConfigurationResponse extends js.Object {
  
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurationUsageList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationUsageList] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListUsageForLicenseConfigurationResponse {
  
  @scala.inline
  def apply(): ListUsageForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
  }
  
  @scala.inline
  implicit class ListUsageForLicenseConfigurationResponseOps[Self <: ListUsageForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setLicenseConfigurationUsageListVarargs(value: LicenseConfigurationUsage*): Self = this.set("LicenseConfigurationUsageList", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationUsageList(value: LicenseConfigurationUsageList): Self = this.set("LicenseConfigurationUsageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationUsageList: Self = this.set("LicenseConfigurationUsageList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
