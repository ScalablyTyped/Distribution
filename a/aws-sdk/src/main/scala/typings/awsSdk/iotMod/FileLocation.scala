package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileLocation extends js.Object {
  /**
    * The location of the updated firmware in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
  /**
    * The stream that contains the OTA update.
    */
  var stream: js.UndefOr[Stream] = js.native
}

object FileLocation {
  @scala.inline
  def apply(): FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLocation]
  }
  @scala.inline
  implicit class FileLocationOps[Self <: FileLocation] (val x: Self) extends AnyVal {
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
    def setS3Location(value: S3Location): Self = this.set("s3Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Location: Self = this.set("s3Location", js.undefined)
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

