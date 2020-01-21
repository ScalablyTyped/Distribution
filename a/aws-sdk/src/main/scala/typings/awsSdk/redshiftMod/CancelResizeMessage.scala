package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelResizeMessage extends js.Object {
  /**
    * The unique identifier for the cluster that you want to cancel a resize operation for.
    */
  var ClusterIdentifier: String = js.native
}

object CancelResizeMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): CancelResizeMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelResizeMessage]
  }
}

