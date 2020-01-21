package typings.awsSdkClientS3Node.typesCompletedMultipartUploadMod

import typings.awsSdkClientS3Node.typesCompletedPartMod.CompletedPart
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedMultipartUpload extends js.Object {
  /**
    * _CompletedPartList shape
    */
  var Parts: js.UndefOr[js.Array[CompletedPart] | Iterable[CompletedPart]] = js.undefined
}

object CompletedMultipartUpload {
  @scala.inline
  def apply(Parts: js.Array[CompletedPart] | Iterable[CompletedPart] = null): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
}

