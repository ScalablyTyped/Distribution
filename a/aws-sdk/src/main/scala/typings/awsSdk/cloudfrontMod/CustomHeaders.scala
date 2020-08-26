package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeaders extends js.Object {
  /**
    *  Optional: A list that contains one OriginCustomHeader element for each custom header that you want CloudFront to forward to the origin. If Quantity is 0, omit Items.
    */
  var Items: js.UndefOr[OriginCustomHeadersList] = js.native
  /**
    * The number of custom headers, if any, for this distribution.
    */
  var Quantity: integer = js.native
}

object CustomHeaders {
  @scala.inline
  def apply(Quantity: integer): CustomHeaders = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeaders]
  }
  @scala.inline
  implicit class CustomHeadersOps[Self <: CustomHeaders] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: OriginCustomHeader*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: OriginCustomHeadersList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

