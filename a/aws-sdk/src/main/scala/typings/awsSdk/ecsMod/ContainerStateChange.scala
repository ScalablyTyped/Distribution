package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStateChange extends js.Object {
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The exit code for the container, if the state change is a result of the container exiting.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The container image SHA 256 digest.
    */
  var imageDigest: js.UndefOr[String] = js.native
  /**
    * Any network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The reason for the state change.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The status of the container.
    */
  var status: js.UndefOr[String] = js.native
}

object ContainerStateChange {
  @scala.inline
  def apply(
    containerName: String = null,
    exitCode: js.UndefOr[BoxedInteger] = js.undefined,
    imageDigest: String = null,
    networkBindings: NetworkBindings = null,
    reason: String = null,
    runtimeId: String = null,
    status: String = null
  ): ContainerStateChange = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode.get.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateChange]
  }
}

