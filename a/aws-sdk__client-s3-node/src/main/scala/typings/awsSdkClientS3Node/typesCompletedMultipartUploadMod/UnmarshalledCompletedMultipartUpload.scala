package typings.awsSdkClientS3Node.typesCompletedMultipartUploadMod

import typings.awsSdkClientS3Node.typesCompletedPartMod.UnmarshalledCompletedPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCompletedMultipartUpload extends CompletedMultipartUpload {
  /**
    * _CompletedPartList shape
    */
  @JSName("Parts")
  var Parts_UnmarshalledCompletedMultipartUpload: js.UndefOr[js.Array[UnmarshalledCompletedPart]] = js.native
}

object UnmarshalledCompletedMultipartUpload {
  @scala.inline
  def apply(): UnmarshalledCompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCompletedMultipartUpload]
  }
  @scala.inline
  implicit class UnmarshalledCompletedMultipartUploadOps[Self <: UnmarshalledCompletedMultipartUpload] (val x: Self) extends AnyVal {
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
    def setPartsVarargs(value: UnmarshalledCompletedPart*): Self = this.set("Parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[UnmarshalledCompletedPart]): Self = this.set("Parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("Parts", js.undefined)
  }
  
}

