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
  def apply(fileId: Int | Double = null, s3Location: S3Location = null): StreamFile = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamFile]
  }
}

