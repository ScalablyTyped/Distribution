package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  /**
    * The Amazon S3 bucket name and file name for the video.
    */
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.native
}

object Video {
  @scala.inline
  def apply(S3Object: S3Object = null): Video = {
    val __obj = js.Dynamic.literal()
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

