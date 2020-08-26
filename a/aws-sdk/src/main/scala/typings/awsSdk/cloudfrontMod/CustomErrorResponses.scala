package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomErrorResponses extends js.Object {
  /**
    * A complex type that contains a CustomErrorResponse element for each HTTP status code for which you want to specify a custom error page and/or a caching duration. 
    */
  var Items: js.UndefOr[CustomErrorResponseList] = js.native
  /**
    * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If Quantity is 0, you can omit Items.
    */
  var Quantity: integer = js.native
}

object CustomErrorResponses {
  @scala.inline
  def apply(Quantity: integer): CustomErrorResponses = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomErrorResponses]
  }
  @scala.inline
  implicit class CustomErrorResponsesOps[Self <: CustomErrorResponses] (val x: Self) extends AnyVal {
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
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: CustomErrorResponse*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: CustomErrorResponseList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

