package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  /**
    * The S3 object location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is:   s3://&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  s3://examplebucket/example.mp4   s3://examplebucket/mediadocs/example.mp4  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.native
}

object Media {
  @scala.inline
  def apply(MediaFileUri: Uri = null): Media = {
    val __obj = js.Dynamic.literal()
    if (MediaFileUri != null) __obj.updateDynamic("MediaFileUri")(MediaFileUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

