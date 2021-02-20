package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFleetsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the EC2 Fleets.
    */
  var FleetIds: FleetIdSet = js.native
  
  /**
    * Indicates whether to terminate the instances when the EC2 Fleet is deleted. The default is to terminate the instances. To let the instances continue to run after the EC2 Fleet is deleted, specify NoTerminateInstances. Supported only for fleets of type maintain and request. For instant fleets, you cannot specify NoTerminateInstances. A deleted instant fleet with running instances is not supported.
    */
  var TerminateInstances: Boolean = js.native
}
object DeleteFleetsRequest {
  
  @scala.inline
  def apply(FleetIds: FleetIdSet, TerminateInstances: Boolean): DeleteFleetsRequest = {
    val __obj = js.Dynamic.literal(FleetIds = FleetIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetsRequest]
  }
  
  @scala.inline
  implicit class DeleteFleetsRequestMutableBuilder[Self <: DeleteFleetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFleetIds(value: FleetIdSet): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdsVarargs(value: FleetId*): Self = StObject.set(x, "FleetIds", js.Array(value :_*))
    
    @scala.inline
    def setTerminateInstances(value: Boolean): Self = StObject.set(x, "TerminateInstances", value.asInstanceOf[js.Any])
  }
}
