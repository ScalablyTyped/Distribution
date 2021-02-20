package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseSpecificationsForResourceResponse extends StObject {
  
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
  implicit class ListLicenseSpecificationsForResourceResponseMutableBuilder[Self <: ListLicenseSpecificationsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
