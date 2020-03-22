package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to be resumed.
    */
  var ClusterIdentifier: String = js.native
}

object ResumeClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ResumeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResumeClusterMessage]
  }
}

