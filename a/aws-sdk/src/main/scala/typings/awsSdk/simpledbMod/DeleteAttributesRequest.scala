package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAttributesRequest extends js.Object {
  /**
    * A list of Attributes. Similar to columns on a spreadsheet, attributes represent categories of data that can be assigned to items.
    */
  var Attributes: js.UndefOr[DeletableAttributeList] = js.native
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  /**
    * The update condition which, if specified, determines whether the specified attributes will be deleted or not. The update condition must be satisfied in order for this request to be processed and the attributes to be deleted.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  /**
    * The name of the item. Similar to rows on a spreadsheet, items represent individual objects that contain one or more value-attribute pairs.
    */
  var ItemName: String = js.native
}

object DeleteAttributesRequest {
  @scala.inline
  def apply(DomainName: String, ItemName: String): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
  @scala.inline
  implicit class DeleteAttributesRequestOps[Self <: DeleteAttributesRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: DeletableAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: DeletableAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setExpected(value: UpdateCondition): Self = this.set("Expected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpected: Self = this.set("Expected", js.undefined)
  }
  
}

