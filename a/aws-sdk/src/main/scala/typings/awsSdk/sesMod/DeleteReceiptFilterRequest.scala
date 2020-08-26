package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReceiptFilterRequest extends js.Object {
  /**
    * The name of the IP address filter to delete.
    */
  var FilterName: ReceiptFilterName = js.native
}

object DeleteReceiptFilterRequest {
  @scala.inline
  def apply(FilterName: ReceiptFilterName): DeleteReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptFilterRequest]
  }
  @scala.inline
  implicit class DeleteReceiptFilterRequestOps[Self <: DeleteReceiptFilterRequest] (val x: Self) extends AnyVal {
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
    def setFilterName(value: ReceiptFilterName): Self = this.set("FilterName", value.asInstanceOf[js.Any])
  }
  
}

