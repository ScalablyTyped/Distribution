package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelClusterRequest extends js.Object {
  /**
    * The 39-character ID for the cluster that you want to cancel, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId = js.native
}

object CancelClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): CancelClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelClusterRequest]
  }
}

