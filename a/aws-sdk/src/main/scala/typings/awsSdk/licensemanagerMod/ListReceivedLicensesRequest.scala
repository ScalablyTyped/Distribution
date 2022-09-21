package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceivedLicensesRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters are supported:    ProductSKU     Status     Fingerprint     IssuerName     Beneficiary   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Amazon Resource Names (ARNs) of the licenses.
    */
  var LicenseArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReceivedLicensesRequest {
  
  inline def apply(): ListReceivedLicensesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceivedLicensesRequest]
  }
  
  extension [Self <: ListReceivedLicensesRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLicenseArns(value: ArnList): Self = StObject.set(x, "LicenseArns", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnsUndefined: Self = StObject.set(x, "LicenseArns", js.undefined)
    
    inline def setLicenseArnsVarargs(value: Arn*): Self = StObject.set(x, "LicenseArns", js.Array(value*))
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
