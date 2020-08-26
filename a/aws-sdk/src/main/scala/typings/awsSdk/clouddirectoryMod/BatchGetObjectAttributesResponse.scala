package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectAttributesResponse extends js.Object {
  /**
    * The attribute values that are associated with an object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object BatchGetObjectAttributesResponse {
  @scala.inline
  def apply(): BatchGetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetObjectAttributesResponse]
  }
  @scala.inline
  implicit class BatchGetObjectAttributesResponseOps[Self <: BatchGetObjectAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: AttributeKeyAndValue*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeKeyAndValueList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

