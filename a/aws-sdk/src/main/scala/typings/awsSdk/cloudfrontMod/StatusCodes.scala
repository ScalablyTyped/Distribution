package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodes extends js.Object {
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList = js.native
  /**
    * The number of status codes.
    */
  var Quantity: integer = js.native
}

object StatusCodes {
  @scala.inline
  def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodes]
  }
  @scala.inline
  implicit class StatusCodesOps[Self <: StatusCodes] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: integer*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: StatusCodeList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
  }
  
}

