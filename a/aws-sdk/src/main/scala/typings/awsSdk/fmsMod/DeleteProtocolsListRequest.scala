package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProtocolsListRequest extends js.Object {
  /**
    * The ID of the protocols list that you want to delete. You can retrieve this ID from PutProtocolsList, ListProtocolsLists, and GetProtocolsLost.
    */
  var ListId: typings.awsSdk.fmsMod.ListId = js.native
}

object DeleteProtocolsListRequest {
  @scala.inline
  def apply(ListId: ListId): DeleteProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtocolsListRequest]
  }
  @scala.inline
  implicit class DeleteProtocolsListRequestOps[Self <: DeleteProtocolsListRequest] (val x: Self) extends AnyVal {
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
    def setListId(value: ListId): Self = this.set("ListId", value.asInstanceOf[js.Any])
  }
  
}

