package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsageForLicenseConfigurationResponse extends StObject {
  
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
  implicit class ListUsageForLicenseConfigurationResponseMutableBuilder[Self <: ListUsageForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationUsageList(value: LicenseConfigurationUsageList): Self = StObject.set(x, "LicenseConfigurationUsageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationUsageListUndefined: Self = StObject.set(x, "LicenseConfigurationUsageList", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationUsageListVarargs(value: LicenseConfigurationUsage*): Self = StObject.set(x, "LicenseConfigurationUsageList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
