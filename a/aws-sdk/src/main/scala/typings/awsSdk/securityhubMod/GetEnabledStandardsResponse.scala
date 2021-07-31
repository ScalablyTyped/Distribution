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
  
  @scala.inline
  def apply(): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
  
  @scala.inline
  implicit class GetEnabledStandardsResponseMutableBuilder[Self <: GetEnabledStandardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStandardsSubscriptions(value: StandardsSubscriptions): Self = StObject.set(x, "StandardsSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionsUndefined: Self = StObject.set(x, "StandardsSubscriptions", js.undefined)
    
    @scala.inline
    def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = StObject.set(x, "StandardsSubscriptions", js.Array(value :_*))
  }
}
