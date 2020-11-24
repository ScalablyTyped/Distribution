package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
  
  /**
    * Information about the associations for the license configuration.
    */
  var LicenseConfigurationAssociations: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationAssociations] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListAssociationsForLicenseConfigurationResponse {
  
  @scala.inline
  def apply(): ListAssociationsForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
  }
  
  @scala.inline
  implicit class ListAssociationsForLicenseConfigurationResponseOps[Self <: ListAssociationsForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setLicenseConfigurationAssociationsVarargs(value: LicenseConfigurationAssociation*): Self = this.set("LicenseConfigurationAssociations", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationAssociations(value: LicenseConfigurationAssociations): Self = this.set("LicenseConfigurationAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationAssociations: Self = this.set("LicenseConfigurationAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
