package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseConfigurationsRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters and logical operators are supported:    licenseCountingType - The dimension on which licenses are counted. Possible values are vCPU | Instance | Core | Socket. Logical operators are EQUALS | NOT_EQUALS.    enforceLicenseCount - A Boolean value that indicates whether hard license enforcement is used. Logical operators are EQUALS | NOT_EQUALS.    usagelimitExceeded - A Boolean value that indicates whether the available licenses have been exceeded. Logical operators are EQUALS | NOT_EQUALS.  
    */
  var Filters: js.UndefOr[typings.awsSdk.licensemanagerMod.Filters] = js.native
  
  /**
    * Amazon Resource Names (ARN) of the license configurations.
    */
  var LicenseConfigurationArns: js.UndefOr[StringList] = js.native
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListLicenseConfigurationsRequest {
  
  @scala.inline
  def apply(): ListLicenseConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListLicenseConfigurationsRequestMutableBuilder[Self <: ListLicenseConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationArns(value: StringList): Self = StObject.set(x, "LicenseConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "LicenseConfigurationArns", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: String*): Self = StObject.set(x, "LicenseConfigurationArns", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
