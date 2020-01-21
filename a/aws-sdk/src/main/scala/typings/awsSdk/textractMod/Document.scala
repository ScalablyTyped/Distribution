package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * A blob of base64-encoded document bytes. The maximum size of a document that's provided in a blob of bytes is 5 MB. The document bytes must be in PNG or JPEG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using the Bytes field. 
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  /**
    * Identifies an S3 object as the document source. The maximum size of a document that's stored in an S3 bucket is 5 MB.
    */
  var S3Object: js.UndefOr[typings.awsSdk.textractMod.S3Object] = js.native
}

object Document {
  @scala.inline
  def apply(Bytes: ImageBlob = null, S3Object: S3Object = null): Document = {
    val __obj = js.Dynamic.literal()
    if (Bytes != null) __obj.updateDynamic("Bytes")(Bytes.asInstanceOf[js.Any])
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

