package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorTargetRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: typings.awsSdk.ec2Mod.TrafficMirrorTargetId
}
object DeleteTrafficMirrorTargetRequest {
  
  @scala.inline
  def apply(TrafficMirrorTargetId: TrafficMirrorTargetId): DeleteTrafficMirrorTargetRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorTargetId = TrafficMirrorTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorTargetRequest]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorTargetRequestMutableBuilder[Self <: DeleteTrafficMirrorTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTrafficMirrorTargetId(value: TrafficMirrorTargetId): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
  }
}
