package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrustStoreCertificatesRequest extends StObject {
  
  /**
    * The maximum number of results to be included in the next page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ARN of the trust store
    */
  var trustStoreArn: ARN
}
object ListTrustStoreCertificatesRequest {
  
  inline def apply(trustStoreArn: ARN): ListTrustStoreCertificatesRequest = {
    val __obj = js.Dynamic.literal(trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrustStoreCertificatesRequest]
  }
  
  extension [Self <: ListTrustStoreCertificatesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
