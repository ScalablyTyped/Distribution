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
  def apply(Bytes: ImageBlob = null, S3Object: S3Object = null): Image = {
    val __obj = js.Dynamic.literal()
    if (Bytes != null) __obj.updateDynamic("Bytes")(Bytes.asInstanceOf[js.Any])
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

