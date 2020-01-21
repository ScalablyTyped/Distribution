package typings.awsSdkClientS3Browser.typesCompletedMultipartUploadMod

import typings.awsSdkClientS3Browser.typesCompletedPartMod.UnmarshalledCompletedPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCompletedMultipartUpload extends CompletedMultipartUpload {
  /**
    * _CompletedPartList shape
    */
  @JSName("Parts")
  var Parts_UnmarshalledCompletedMultipartUpload: js.UndefOr[js.Array[UnmarshalledCompletedPart]] = js.undefined
}

object UnmarshalledCompletedMultipartUpload {
  @scala.inline
  def apply(Parts: js.Array[UnmarshalledCompletedPart] = null): UnmarshalledCompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCompletedMultipartUpload]
  }
}

