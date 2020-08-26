package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupMembers extends js.Object {
  /**
    * Items (origins) in an origin group.
    */
  var Items: OriginGroupMemberList = js.native
  /**
    * The number of origins in an origin group.
    */
  var Quantity: integer = js.native
}

object OriginGroupMembers {
  @scala.inline
  def apply(Items: OriginGroupMemberList, Quantity: integer): OriginGroupMembers = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMembers]
  }
  @scala.inline
  implicit class OriginGroupMembersOps[Self <: OriginGroupMembers] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: OriginGroupMember*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: OriginGroupMemberList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
  }
  
}

