package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStringNames extends js.Object {
  /**
    * A list of query string names.
    */
  var Items: js.UndefOr[QueryStringNamesList] = js.native
  /**
    * The number of query string names in the Items list.
    */
  var Quantity: integer = js.native
}

object QueryStringNames {
  @scala.inline
  def apply(Quantity: integer): QueryStringNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringNames]
  }
  @scala.inline
  implicit class QueryStringNamesOps[Self <: QueryStringNames] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: QueryStringNamesList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

