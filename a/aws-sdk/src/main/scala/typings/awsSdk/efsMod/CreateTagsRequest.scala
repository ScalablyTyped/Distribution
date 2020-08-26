package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tags you want to modify (String). This operation modifies the tags only, not the file system.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * An array of Tag objects to add. Each Tag object is a key-value pair. 
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Tags: Tags): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  @scala.inline
  implicit class CreateTagsRequestOps[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

