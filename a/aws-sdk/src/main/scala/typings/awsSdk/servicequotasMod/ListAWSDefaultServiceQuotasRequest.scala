package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAWSDefaultServiceQuotasRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, if any, make another call with the token returned from this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicequotasMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.undefined
  
  /**
    * The service identifier.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode
}
object ListAWSDefaultServiceQuotasRequest {
  
  inline def apply(ServiceCode: ServiceCode): ListAWSDefaultServiceQuotasRequest = {
    val __obj = js.Dynamic.literal(ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasRequest]
  }
  
  extension [Self <: ListAWSDefaultServiceQuotasRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
