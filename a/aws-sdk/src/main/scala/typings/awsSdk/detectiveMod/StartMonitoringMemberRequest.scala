package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMonitoringMemberRequest extends StObject {
  
  /**
    * The account ID of the member account to try to enable. The account must be an invited member account with a status of ACCEPTED_BUT_DISABLED. 
    */
  var AccountId: typings.awsSdk.detectiveMod.AccountId = js.native
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}
object StartMonitoringMemberRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, GraphArn: GraphArn): StartMonitoringMemberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMonitoringMemberRequest]
  }
  
  @scala.inline
  implicit class StartMonitoringMemberRequestMutableBuilder[Self <: StartMonitoringMemberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
