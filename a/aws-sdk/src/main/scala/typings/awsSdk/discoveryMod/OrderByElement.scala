package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderByElement extends js.Object {
  /**
    * The field on which to order.
    */
  var fieldName: String = js.native
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.native
}

object OrderByElement {
  @scala.inline
  def apply(fieldName: String): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
  @scala.inline
  implicit class OrderByElementOps[Self <: OrderByElement] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: orderString): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

