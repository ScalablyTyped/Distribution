package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsForPackageResponse extends StObject {
  
  /**
    * List of DomainPackageDetails objects. 
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.opensearchMod.DomainPackageDetailsList] = js.undefined
  
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDomainsForPackageResponse {
  
  inline def apply(): ListDomainsForPackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsForPackageResponse]
  }
  
  extension [Self <: ListDomainsForPackageResponse](x: Self) {
    
    inline def setDomainPackageDetailsList(value: DomainPackageDetailsList): Self = StObject.set(x, "DomainPackageDetailsList", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsListUndefined: Self = StObject.set(x, "DomainPackageDetailsList", js.undefined)
    
    inline def setDomainPackageDetailsListVarargs(value: DomainPackageDetails*): Self = StObject.set(x, "DomainPackageDetailsList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
