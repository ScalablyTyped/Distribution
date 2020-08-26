package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  /**
    * The S3 object location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is: For example: For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.native
}

object Media {
  @scala.inline
  def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
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
    def setMediaFileUri(value: Uri): Self = this.set("MediaFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaFileUri: Self = this.set("MediaFileUri", js.undefined)
  }
  
}

