package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnabledStandardsResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.undefined
  
  /**
    * The list of StandardsSubscriptions objects that include information about the enabled standards.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptions] = js.undefined
}
object GetEnabledStandardsResponse {
  
  inline def apply(): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
  
  extension [Self <: GetEnabledStandardsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandardsSubscriptions(value: StandardsSubscriptions): Self = StObject.set(x, "StandardsSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setStandardsSubscriptionsUndefined: Self = StObject.set(x, "StandardsSubscriptions", js.undefined)
    
    inline def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = StObject.set(x, "StandardsSubscriptions", js.Array(value :_*))
  }
}
