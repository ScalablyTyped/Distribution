package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitTaskStateChangeRequest extends js.Object {
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: js.UndefOr[AttachmentStateChanges] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Any containers associated with the state change request.
    */
  var containers: js.UndefOr[ContainerStateChanges] = js.native
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The task ID or full ARN of the task in the state change request.
    */
  var task: js.UndefOr[String] = js.native
}

object SubmitTaskStateChangeRequest {
  @scala.inline
  def apply(
    attachments: AttachmentStateChanges = null,
    cluster: String = null,
    containers: ContainerStateChanges = null,
    executionStoppedAt: Timestamp = null,
    pullStartedAt: Timestamp = null,
    pullStoppedAt: Timestamp = null,
    reason: String = null,
    status: String = null,
    task: String = null
  ): SubmitTaskStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (executionStoppedAt != null) __obj.updateDynamic("executionStoppedAt")(executionStoppedAt.asInstanceOf[js.Any])
    if (pullStartedAt != null) __obj.updateDynamic("pullStartedAt")(pullStartedAt.asInstanceOf[js.Any])
    if (pullStoppedAt != null) __obj.updateDynamic("pullStoppedAt")(pullStoppedAt.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTaskStateChangeRequest]
  }
}

