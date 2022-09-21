package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsForPackageRequest extends StObject {
  
  /**
    * Limits the results to a maximum number of domains.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opensearchMod.MaxResults] = js.undefined
  
  /**
    * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided, returns results for the next page. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
  
  /**
    * The package for which to list associated domains.
    */
  var PackageID: typings.awsSdk.opensearchMod.PackageID
}
object ListDomainsForPackageRequest {
  
  inline def apply(PackageID: PackageID): ListDomainsForPackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsForPackageRequest]
  }
  
  extension [Self <: ListDomainsForPackageRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
