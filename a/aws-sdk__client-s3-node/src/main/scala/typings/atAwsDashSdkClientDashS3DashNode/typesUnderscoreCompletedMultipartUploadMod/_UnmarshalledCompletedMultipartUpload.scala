package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCompletedMultipartUploadMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCompletedPartMod._UnmarshalledCompletedPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCompletedMultipartUpload extends _CompletedMultipartUpload {
  /**
    * _CompletedPartList shape
    */
  @JSName("Parts")
  var Parts__UnmarshalledCompletedMultipartUpload: js.UndefOr[js.Array[_UnmarshalledCompletedPart]] = js.undefined
}

object _UnmarshalledCompletedMultipartUpload {
  @scala.inline
  def apply(Parts: js.Array[_UnmarshalledCompletedPart] = null): _UnmarshalledCompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledCompletedMultipartUpload]
  }
}

