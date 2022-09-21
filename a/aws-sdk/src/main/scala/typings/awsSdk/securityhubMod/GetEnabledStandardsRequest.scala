package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnabledStandardsRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the GetEnabledStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.undefined
  
  /**
    * The list of the standards subscription ARNs for the standards to retrieve.
    */
  var StandardsSubscriptionArns: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptionArns] = js.undefined
}
object GetEnabledStandardsRequest {
  
  inline def apply(): GetEnabledStandardsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsRequest]
  }
  
  extension [Self <: GetEnabledStandardsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = StObject.set(x, "StandardsSubscriptionArns", value.asInstanceOf[js.Any])
    
    inline def setStandardsSubscriptionArnsUndefined: Self = StObject.set(x, "StandardsSubscriptionArns", js.undefined)
    
    inline def setStandardsSubscriptionArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StandardsSubscriptionArns", js.Array(value*))
  }
}
