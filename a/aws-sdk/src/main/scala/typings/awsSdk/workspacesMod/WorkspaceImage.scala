package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceImage extends js.Object {
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  /**
    * The error code that is returned for the image.
    */
  var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.native
  /**
    * The text of the error message that is returned for the image.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.native
  /**
    * The operating system that the image is running. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.workspacesMod.OperatingSystem] = js.native
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.native
  /**
    * The status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.native
}

object WorkspaceImage {
  @scala.inline
  def apply(
    Description: WorkspaceImageDescription = null,
    ErrorCode: WorkspaceImageErrorCode = null,
    ErrorMessage: Description = null,
    ImageId: WorkspaceImageId = null,
    Name: WorkspaceImageName = null,
    OperatingSystem: OperatingSystem = null,
    RequiredTenancy: WorkspaceImageRequiredTenancy = null,
    State: WorkspaceImageState = null
  ): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (RequiredTenancy != null) __obj.updateDynamic("RequiredTenancy")(RequiredTenancy.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceImage]
  }
}

