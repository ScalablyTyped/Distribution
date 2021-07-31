package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersRequest extends StObject {
  
  /**
    * The list of AWS account identifiers for the member accounts to delete from the behavior graph.
    */
  var AccountIds: AccountIdList
  
  /**
    * The ARN of the behavior graph to delete members from.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn
}
object DeleteMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  @scala.inline
  implicit class DeleteMembersRequestMutableBuilder[Self <: DeleteMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
