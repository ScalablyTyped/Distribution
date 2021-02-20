package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBillingGroupsResponse extends StObject {
  
  /**
    * The list of billing groups.
    */
  var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.native
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBillingGroupsResponse {
  
  @scala.inline
  def apply(): ListBillingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsResponse]
  }
  
  @scala.inline
  implicit class ListBillingGroupsResponseMutableBuilder[Self <: ListBillingGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroups(value: BillingGroupNameAndArnList): Self = StObject.set(x, "billingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupsUndefined: Self = StObject.set(x, "billingGroups", js.undefined)
    
    @scala.inline
    def setBillingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "billingGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
