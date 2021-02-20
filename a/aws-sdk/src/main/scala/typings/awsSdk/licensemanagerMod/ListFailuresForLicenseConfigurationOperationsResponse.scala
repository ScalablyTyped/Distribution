package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFailuresForLicenseConfigurationOperationsResponse extends StObject {
  
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
  implicit class ListFailuresForLicenseConfigurationOperationsResponseMutableBuilder[Self <: ListFailuresForLicenseConfigurationOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseOperationFailureList(value: LicenseOperationFailureList): Self = StObject.set(x, "LicenseOperationFailureList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseOperationFailureListUndefined: Self = StObject.set(x, "LicenseOperationFailureList", js.undefined)
    
    @scala.inline
    def setLicenseOperationFailureListVarargs(value: LicenseOperationFailure*): Self = StObject.set(x, "LicenseOperationFailureList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
