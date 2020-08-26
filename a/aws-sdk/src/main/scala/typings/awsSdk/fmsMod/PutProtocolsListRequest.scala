package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutProtocolsListRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager protocols list to be created.
    */
  var ProtocolsList: ProtocolsListData = js.native
  /**
    * The tags associated with the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.native
}

object PutProtocolsListRequest {
  @scala.inline
  def apply(ProtocolsList: ProtocolsListData): PutProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ProtocolsList = ProtocolsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProtocolsListRequest]
  }
  @scala.inline
  implicit class PutProtocolsListRequestOps[Self <: PutProtocolsListRequest] (val x: Self) extends AnyVal {
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
    def setProtocolsList(value: ProtocolsListData): Self = this.set("ProtocolsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
  
}

