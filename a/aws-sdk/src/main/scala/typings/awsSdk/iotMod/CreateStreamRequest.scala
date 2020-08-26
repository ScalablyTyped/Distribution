package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamRequest extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files to stream.
    */
  var files: StreamFiles = js.native
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
  /**
    * Metadata which can be used to manage streams.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateStreamRequest {
  @scala.inline
  def apply(files: StreamFiles, roleArn: RoleArn, streamId: StreamId): CreateStreamRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamRequest]
  }
  @scala.inline
  implicit class CreateStreamRequestOps[Self <: CreateStreamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilesVarargs(value: StreamFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: StreamFiles): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamId(value: StreamId): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: StreamDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

