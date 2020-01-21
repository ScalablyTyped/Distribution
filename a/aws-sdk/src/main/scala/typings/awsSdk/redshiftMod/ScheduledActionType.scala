package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionType extends js.Object {
  /**
    * An action that runs a ResizeCluster API operation. 
    */
  var ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.native
}

object ScheduledActionType {
  @scala.inline
  def apply(ResizeCluster: ResizeClusterMessage = null): ScheduledActionType = {
    val __obj = js.Dynamic.literal()
    if (ResizeCluster != null) __obj.updateDynamic("ResizeCluster")(ResizeCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionType]
  }
}

