package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: OriginList = js.native
  /**
    * The number of origins or origin groups for this distribution.
    */
  var Quantity: integer = js.native
}

object Origins {
  @scala.inline
  def apply(Items: OriginList, Quantity: integer): Origins = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins]
  }
  @scala.inline
  implicit class OriginsOps[Self <: Origins] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Origin*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: OriginList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
  }
  
}

