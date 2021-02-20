package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorSessionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typings.awsSdk.ec2Mod.TrafficMirrorSessionId = js.native
}
object DeleteTrafficMirrorSessionRequest {
  
  @scala.inline
  def apply(TrafficMirrorSessionId: TrafficMirrorSessionId): DeleteTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorSessionRequest]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorSessionRequestMutableBuilder[Self <: DeleteTrafficMirrorSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTrafficMirrorSessionId(value: TrafficMirrorSessionId): Self = StObject.set(x, "TrafficMirrorSessionId", value.asInstanceOf[js.Any])
  }
}
