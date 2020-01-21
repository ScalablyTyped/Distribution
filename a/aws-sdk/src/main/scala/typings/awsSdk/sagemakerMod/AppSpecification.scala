package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSpecification extends js.Object {
  /**
    * The arguments for a container used to run a processing job.
    */
  var ContainerArguments: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerArguments] = js.native
  /**
    * The entrypoint for a container used to run a processing job.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  /**
    * The container image to be run by the processing job.
    */
  var ImageUri: typings.awsSdk.sagemakerMod.ImageUri = js.native
}

object AppSpecification {
  @scala.inline
  def apply(
    ImageUri: ImageUri,
    ContainerArguments: ContainerArguments = null,
    ContainerEntrypoint: ContainerEntrypoint = null
  ): AppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    if (ContainerArguments != null) __obj.updateDynamic("ContainerArguments")(ContainerArguments.asInstanceOf[js.Any])
    if (ContainerEntrypoint != null) __obj.updateDynamic("ContainerEntrypoint")(ContainerEntrypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecification]
  }
}

