package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIndexFieldResponse extends js.Object {
  /**
    * The status of the index field being deleted.
    */
  var IndexField: IndexFieldStatus = js.native
}

object DeleteIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DeleteIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexFieldResponse]
  }
  @scala.inline
  implicit class DeleteIndexFieldResponseOps[Self <: DeleteIndexFieldResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexField(value: IndexFieldStatus): Self = this.set("IndexField", value.asInstanceOf[js.Any])
  }
  
}

