package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseConfigurationsResponse extends js.Object {
  
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurations: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurations] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListLicenseConfigurationsResponse {
  
  @scala.inline
  def apply(): ListLicenseConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListLicenseConfigurationsResponseOps[Self <: ListLicenseConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setLicenseConfigurationsVarargs(value: LicenseConfiguration*): Self = this.set("LicenseConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurations(value: LicenseConfigurations): Self = this.set("LicenseConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurations: Self = this.set("LicenseConfigurations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
