package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamRequest extends js.Object {
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files associated with the stream.
    */
  var files: js.UndefOr[StreamFiles] = js.native
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}

object UpdateStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): UpdateStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamRequest]
  }
  @scala.inline
  implicit class UpdateStreamRequestOps[Self <: UpdateStreamRequest] (val x: Self) extends AnyVal {
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
    def setStreamId(value: StreamId): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: StreamDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFilesVarargs(value: StreamFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: StreamFiles): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

