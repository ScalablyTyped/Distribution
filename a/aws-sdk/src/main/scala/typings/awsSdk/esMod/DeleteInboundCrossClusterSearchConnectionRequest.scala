package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInboundCrossClusterSearchConnectionRequest extends js.Object {
  /**
    * The id of the inbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}

object DeleteInboundCrossClusterSearchConnectionRequest {
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionRequest]
  }
  @scala.inline
  implicit class DeleteInboundCrossClusterSearchConnectionRequestOps[Self <: DeleteInboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
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
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = this.set("CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
  
}

