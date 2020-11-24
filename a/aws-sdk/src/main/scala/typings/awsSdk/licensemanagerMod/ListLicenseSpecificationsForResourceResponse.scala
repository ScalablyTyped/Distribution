package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseSpecificationsForResourceResponse extends js.Object {
  
  /**
    * License configurations associated with a resource.
    */
  var LicenseSpecifications: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseSpecifications] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListLicenseSpecificationsForResourceResponse {
  
  @scala.inline
  def apply(): ListLicenseSpecificationsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListLicenseSpecificationsForResourceResponseOps[Self <: ListLicenseSpecificationsForResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLicenseSpecifications(value: LicenseSpecifications): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
