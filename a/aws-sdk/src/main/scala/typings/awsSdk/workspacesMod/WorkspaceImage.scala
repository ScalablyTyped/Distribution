package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceImage extends js.Object {
  /**
    * The date when the image was created. If the image has been shared, the AWS account that the image has been shared with sees the original creation date of the image.
    */
  var Created: js.UndefOr[Timestamp] = js.native
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
    * The identifier of the AWS account that owns the image.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.native
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
  def apply(): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceImage]
  }
  @scala.inline
  implicit class WorkspaceImageOps[Self <: WorkspaceImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    @scala.inline
    def setDescription(value: WorkspaceImageDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setErrorCode(value: WorkspaceImageErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: Description): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setName(value: WorkspaceImageName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    @scala.inline
    def setOwnerAccountId(value: AwsAccount): Self = this.set("OwnerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("OwnerAccountId", js.undefined)
    @scala.inline
    def setRequiredTenancy(value: WorkspaceImageRequiredTenancy): Self = this.set("RequiredTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredTenancy: Self = this.set("RequiredTenancy", js.undefined)
    @scala.inline
    def setState(value: WorkspaceImageState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

