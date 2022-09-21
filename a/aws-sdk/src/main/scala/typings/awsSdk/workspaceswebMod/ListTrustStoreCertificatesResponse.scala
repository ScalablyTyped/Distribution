package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrustStoreCertificatesResponse extends StObject {
  
  /**
    * The certificate list.
    */
  var certificateList: js.UndefOr[CertificateSummaryList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.&gt;
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: js.UndefOr[ARN] = js.undefined
}
object ListTrustStoreCertificatesResponse {
  
  inline def apply(): ListTrustStoreCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrustStoreCertificatesResponse]
  }
  
  extension [Self <: ListTrustStoreCertificatesResponse](x: Self) {
    
    inline def setCertificateList(value: CertificateSummaryList): Self = StObject.set(x, "certificateList", value.asInstanceOf[js.Any])
    
    inline def setCertificateListUndefined: Self = StObject.set(x, "certificateList", js.undefined)
    
    inline def setCertificateListVarargs(value: CertificateSummary*): Self = StObject.set(x, "certificateList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
  }
}
