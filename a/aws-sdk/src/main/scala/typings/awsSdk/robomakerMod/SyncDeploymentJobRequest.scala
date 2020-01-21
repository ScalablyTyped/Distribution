package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncDeploymentJobRequest extends js.Object {
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
}

