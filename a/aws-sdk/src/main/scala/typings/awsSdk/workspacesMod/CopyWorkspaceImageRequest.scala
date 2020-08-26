package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWorkspaceImageRequest extends js.Object {
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName = js.native
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId = js.native
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region = js.native
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CopyWorkspaceImageRequest {
  @scala.inline
  def apply(Name: WorkspaceImageName, SourceImageId: WorkspaceImageId, SourceRegion: Region): CopyWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
  @scala.inline
  implicit class CopyWorkspaceImageRequestOps[Self <: CopyWorkspaceImageRequest] (val x: Self) extends AnyVal {
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
    def setName(value: WorkspaceImageName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceImageId(value: WorkspaceImageId): Self = this.set("SourceImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRegion(value: Region): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: WorkspaceImageDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

