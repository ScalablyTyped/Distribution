package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncDeploymentJobRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  
  /**
    * The target fleet for the synchronization.
    */
  var fleet: Arn = js.native
}
object SyncDeploymentJobRequest {
  
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, fleet: Arn): SyncDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncDeploymentJobRequest]
  }
  
  @scala.inline
  implicit class SyncDeploymentJobRequestMutableBuilder[Self <: SyncDeploymentJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
  }
}
