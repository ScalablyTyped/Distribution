package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetGraphMemberDatasourcesRequest extends StObject {
  
  /**
    * The list of Amazon Web Services accounts to get data source package information on.
    */
  var AccountIds: AccountIdExtendedList
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn
}
object BatchGetGraphMemberDatasourcesRequest {
  
  inline def apply(AccountIds: AccountIdExtendedList, GraphArn: GraphArn): BatchGetGraphMemberDatasourcesRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetGraphMemberDatasourcesRequest]
  }
  
  extension [Self <: BatchGetGraphMemberDatasourcesRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdExtendedList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
