package typings.chartmogulNode.mod.Invoice

import typings.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvoicesParams extends CursorParams {
  var customer_uuid: js.UndefOr[String] = js.native
  var data_source_uuid: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
}

object ListInvoicesParams {
  @scala.inline
  def apply(): ListInvoicesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvoicesParams]
  }
  @scala.inline
  implicit class ListInvoicesParamsOps[Self <: ListInvoicesParams] (val x: Self) extends AnyVal {
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
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_uuid: Self = this.set("customer_uuid", js.undefined)
    @scala.inline
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_source_uuid: Self = this.set("data_source_uuid", js.undefined)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
  }
  
}

