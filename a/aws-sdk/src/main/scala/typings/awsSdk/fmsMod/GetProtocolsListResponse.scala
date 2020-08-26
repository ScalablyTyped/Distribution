package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProtocolsListResponse extends js.Object {
  /**
    * Information about the specified AWS Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[ProtocolsListData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the specified protocols list.
    */
  var ProtocolsListArn: js.UndefOr[ResourceArn] = js.native
}

object GetProtocolsListResponse {
  @scala.inline
  def apply(): GetProtocolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtocolsListResponse]
  }
  @scala.inline
  implicit class GetProtocolsListResponseOps[Self <: GetProtocolsListResponse] (val x: Self) extends AnyVal {
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
    def deleteProtocolsList: Self = this.set("ProtocolsList", js.undefined)
    @scala.inline
    def setProtocolsListArn(value: ResourceArn): Self = this.set("ProtocolsListArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolsListArn: Self = this.set("ProtocolsListArn", js.undefined)
  }
  
}

