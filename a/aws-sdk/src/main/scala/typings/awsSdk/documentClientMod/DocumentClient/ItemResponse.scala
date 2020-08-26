package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemResponse extends js.Object {
  /**
    * Map of attribute data consisting of the data type and attribute value.
    */
  var Item: js.UndefOr[AttributeMap] = js.native
}

object ItemResponse {
  @scala.inline
  def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  @scala.inline
  implicit class ItemResponseOps[Self <: ItemResponse] (val x: Self) extends AnyVal {
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
    def setItem(value: AttributeMap): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

