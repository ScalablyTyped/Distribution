package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntitlementsResponse extends StObject {
  
  /**
    * A list of entitlements that have been granted to you from other AWS accounts.
    */
  var Entitlements: js.UndefOr[listOfListedEntitlement] = js.native
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListEntitlementsResponse {
  
  @scala.inline
  def apply(): ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitlementsResponse]
  }
  
  @scala.inline
  implicit class ListEntitlementsResponseMutableBuilder[Self <: ListEntitlementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlements(value: listOfListedEntitlement): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    @scala.inline
    def setEntitlementsVarargs(value: ListedEntitlement*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
