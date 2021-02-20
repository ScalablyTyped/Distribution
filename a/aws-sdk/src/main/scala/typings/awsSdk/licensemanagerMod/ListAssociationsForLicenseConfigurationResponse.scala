package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociationsForLicenseConfigurationResponse extends StObject {
  
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
  implicit class ListAssociationsForLicenseConfigurationResponseMutableBuilder[Self <: ListAssociationsForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationAssociations(value: LicenseConfigurationAssociations): Self = StObject.set(x, "LicenseConfigurationAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationAssociationsUndefined: Self = StObject.set(x, "LicenseConfigurationAssociations", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationAssociationsVarargs(value: LicenseConfigurationAssociation*): Self = StObject.set(x, "LicenseConfigurationAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
