package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
  
  /**
    * License configuration operations that failed.
    */
  var LicenseOperationFailureList: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseOperationFailureList] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListFailuresForLicenseConfigurationOperationsResponse {
  
  @scala.inline
  def apply(): ListFailuresForLicenseConfigurationOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
  }
  
  @scala.inline
  implicit class ListFailuresForLicenseConfigurationOperationsResponseOps[Self <: ListFailuresForLicenseConfigurationOperationsResponse] (val x: Self) extends AnyVal {
    
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
    def setLicenseOperationFailureListVarargs(value: LicenseOperationFailure*): Self = this.set("LicenseOperationFailureList", js.Array(value :_*))
    
    @scala.inline
    def setLicenseOperationFailureList(value: LicenseOperationFailureList): Self = this.set("LicenseOperationFailureList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseOperationFailureList: Self = this.set("LicenseOperationFailureList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
