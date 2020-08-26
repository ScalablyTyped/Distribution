package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamFile extends js.Object {
  /**
    * The file ID.
    */
  var fileId: js.UndefOr[FileId] = js.native
  /**
    * The location of the file in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}

object StreamFile {
  @scala.inline
  def apply(): StreamFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamFile]
  }
  @scala.inline
  implicit class StreamFileOps[Self <: StreamFile] (val x: Self) extends AnyVal {
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
    def setFileId(value: FileId): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setS3Location(value: S3Location): Self = this.set("s3Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Location: Self = this.set("s3Location", js.undefined)
  }
  
}

