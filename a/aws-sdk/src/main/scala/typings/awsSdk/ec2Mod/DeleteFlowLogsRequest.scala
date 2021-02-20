package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFlowLogsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: FlowLogIdList = js.native
}
object DeleteFlowLogsRequest {
  
  @scala.inline
  def apply(FlowLogIds: FlowLogIdList): DeleteFlowLogsRequest = {
    val __obj = js.Dynamic.literal(FlowLogIds = FlowLogIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowLogsRequest]
  }
  
  @scala.inline
  implicit class DeleteFlowLogsRequestMutableBuilder[Self <: DeleteFlowLogsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFlowLogIds(value: FlowLogIdList): Self = StObject.set(x, "FlowLogIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogIdsVarargs(value: VpcFlowLogId*): Self = StObject.set(x, "FlowLogIds", js.Array(value :_*))
  }
}
