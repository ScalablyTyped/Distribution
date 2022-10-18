package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrustStoresResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The trust stores.
    */
  var trustStores: js.UndefOr[TrustStoreSummaryList] = js.undefined
}
object ListTrustStoresResponse {
  
  inline def apply(): ListTrustStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrustStoresResponse]
  }
  
  extension [Self <: ListTrustStoresResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTrustStores(value: TrustStoreSummaryList): Self = StObject.set(x, "trustStores", value.asInstanceOf[js.Any])
    
    inline def setTrustStoresUndefined: Self = StObject.set(x, "trustStores", js.undefined)
    
    inline def setTrustStoresVarargs(value: TrustStoreSummary*): Self = StObject.set(x, "trustStores", js.Array(value*))
  }
}
