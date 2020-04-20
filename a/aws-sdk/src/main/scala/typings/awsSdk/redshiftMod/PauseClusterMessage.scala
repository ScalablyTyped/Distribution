package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to be paused.
    */
  var ClusterIdentifier: String = js.native
}

object PauseClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): PauseClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseClusterMessage]
  }
}

