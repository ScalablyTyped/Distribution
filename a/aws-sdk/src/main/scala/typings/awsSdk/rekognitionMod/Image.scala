package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * Blob of image bytes up to 5 MBs.
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  /**
    * Identifies an S3 object as the image source.
    */
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.native
}

object Image {
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setBytes(value: ImageBlob): Self = this.set("Bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytes: Self = this.set("Bytes", js.undefined)
    @scala.inline
    def setS3Object(value: S3Object): Self = this.set("S3Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Object: Self = this.set("S3Object", js.undefined)
  }
  
}

