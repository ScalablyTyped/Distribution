package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.native
  /**
    * The number of CPU units set for the container. The value will be 0 if no value was specified in the container definition when the task definition was registered.
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The exit code returned from the container.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The IDs of each GPU assigned to the container.
    */
  var gpuIds: js.UndefOr[GpuIds] = js.native
  /**
    * The health status of the container. If health checks are not configured for this container in its task definition, then it reports the health status as UNKNOWN.
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.native
  /**
    * The image used for the container.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The container image manifest digest.  The imageDigest is only returned if the container is using an image hosted in Amazon ECR, otherwise it is omitted. 
    */
  var imageDigest: js.UndefOr[String] = js.native
  /**
    * The last known status of the container.
    */
  var lastStatus: js.UndefOr[String] = js.native
  /**
    * The hard limit (in MiB) of memory set for the container.
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * The soft limit (in MiB) of memory set for the container.
    */
  var memoryReservation: js.UndefOr[String] = js.native
  /**
    * The name of the container.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The network interfaces associated with the container.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The ARN of the task.
    */
  var taskArn: js.UndefOr[String] = js.native
}

object Container {
  @scala.inline
  def apply(
    containerArn: String = null,
    cpu: String = null,
    exitCode: Int | scala.Double = null,
    gpuIds: GpuIds = null,
    healthStatus: HealthStatus = null,
    image: String = null,
    imageDigest: String = null,
    lastStatus: String = null,
    memory: String = null,
    memoryReservation: String = null,
    name: String = null,
    networkBindings: NetworkBindings = null,
    networkInterfaces: NetworkInterfaces = null,
    reason: String = null,
    runtimeId: String = null,
    taskArn: String = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (containerArn != null) __obj.updateDynamic("containerArn")(containerArn.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (gpuIds != null) __obj.updateDynamic("gpuIds")(gpuIds.asInstanceOf[js.Any])
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (memoryReservation != null) __obj.updateDynamic("memoryReservation")(memoryReservation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId.asInstanceOf[js.Any])
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

