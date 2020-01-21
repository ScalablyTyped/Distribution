package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitContainerStateChangeRequest extends js.Object {
  /**
    * The short name or full ARN of the cluster that hosts the container.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The exit code returned for the state change request.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The network bindings of the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
    */
  var task: js.UndefOr[String] = js.native
}

object SubmitContainerStateChangeRequest {
  @scala.inline
  def apply(
    cluster: String = null,
    containerName: String = null,
    exitCode: Int | scala.Double = null,
    networkBindings: NetworkBindings = null,
    reason: String = null,
    runtimeId: String = null,
    status: String = null,
    task: String = null
  ): SubmitContainerStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitContainerStateChangeRequest]
  }
}

