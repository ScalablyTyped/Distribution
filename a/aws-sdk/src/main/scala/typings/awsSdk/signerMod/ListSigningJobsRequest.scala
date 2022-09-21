package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSigningJobsRequest extends StObject {
  
  /**
    * Filters results to return only signing jobs with revoked signatures.
    */
  var isRevoked: js.UndefOr[bool] = js.undefined
  
  /**
    * Filters results to return only signing jobs initiated by a specified IAM entity.
    */
  var jobInvoker: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If additional items exist beyond the number you specify, the nextToken element is set in the response. Use the nextToken value in a subsequent request to retrieve additional items. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * String for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of microcontroller platform that you specified for the distribution of your code image.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.undefined
  
  /**
    * Filters results to return only signing jobs with signatures expiring after a specified timestamp.
    */
  var signatureExpiresAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters results to return only signing jobs with signatures expiring before a specified timestamp.
    */
  var signatureExpiresBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A status value with which to filter your results.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
}
object ListSigningJobsRequest {
  
  inline def apply(): ListSigningJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsRequest]
  }
  
  extension [Self <: ListSigningJobsRequest](x: Self) {
    
    inline def setIsRevoked(value: bool): Self = StObject.set(x, "isRevoked", value.asInstanceOf[js.Any])
    
    inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
    
    inline def setJobInvoker(value: AccountId): Self = StObject.set(x, "jobInvoker", value.asInstanceOf[js.Any])
    
    inline def setJobInvokerUndefined: Self = StObject.set(x, "jobInvoker", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setRequestedBy(value: RequestedBy): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setRequestedByUndefined: Self = StObject.set(x, "requestedBy", js.undefined)
    
    inline def setSignatureExpiresAfter(value: js.Date): Self = StObject.set(x, "signatureExpiresAfter", value.asInstanceOf[js.Any])
    
    inline def setSignatureExpiresAfterUndefined: Self = StObject.set(x, "signatureExpiresAfter", js.undefined)
    
    inline def setSignatureExpiresBefore(value: js.Date): Self = StObject.set(x, "signatureExpiresBefore", value.asInstanceOf[js.Any])
    
    inline def setSignatureExpiresBeforeUndefined: Self = StObject.set(x, "signatureExpiresBefore", js.undefined)
    
    inline def setStatus(value: SigningStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
