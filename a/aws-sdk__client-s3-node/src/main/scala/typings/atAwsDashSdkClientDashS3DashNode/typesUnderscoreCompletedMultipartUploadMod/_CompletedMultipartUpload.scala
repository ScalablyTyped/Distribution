package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCompletedMultipartUploadMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCompletedPartMod._CompletedPart
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CompletedMultipartUpload extends js.Object {
  /**
    * _CompletedPartList shape
    */
  var Parts: js.UndefOr[js.Array[_CompletedPart] | Iterable[_CompletedPart]] = js.undefined
}

object _CompletedMultipartUpload {
  @scala.inline
  def apply(Parts: js.Array[_CompletedPart] | Iterable[_CompletedPart] = null): _CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CompletedMultipartUpload]
  }
}

