package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDetails extends js.Object {
  /**
    * The identifier of the image related to a finding.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the image related to a finding.
    */
  var ImageName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when the container started.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the container related to a finding.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object ContainerDetails {
  @scala.inline
  def apply(
    ImageId: NonEmptyString = null,
    ImageName: NonEmptyString = null,
    LaunchedAt: NonEmptyString = null,
    Name: NonEmptyString = null
  ): ContainerDetails = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName.asInstanceOf[js.Any])
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDetails]
  }
}

