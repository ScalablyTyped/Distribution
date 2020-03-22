package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionType extends js.Object {
  /**
    * An action that runs a PauseCluster API operation. 
    */
  var PauseCluster: js.UndefOr[PauseClusterMessage] = js.native
  /**
    * An action that runs a ResizeCluster API operation. 
    */
  var ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.native
  /**
    * An action that runs a ResumeCluster API operation. 
    */
  var ResumeCluster: js.UndefOr[ResumeClusterMessage] = js.native
}

object ScheduledActionType {
  @scala.inline
  def apply(
    PauseCluster: PauseClusterMessage = null,
    ResizeCluster: ResizeClusterMessage = null,
    ResumeCluster: ResumeClusterMessage = null
  ): ScheduledActionType = {
    val __obj = js.Dynamic.literal()
    if (PauseCluster != null) __obj.updateDynamic("PauseCluster")(PauseCluster.asInstanceOf[js.Any])
    if (ResizeCluster != null) __obj.updateDynamic("ResizeCluster")(ResizeCluster.asInstanceOf[js.Any])
    if (ResumeCluster != null) __obj.updateDynamic("ResumeCluster")(ResumeCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionType]
  }
}

