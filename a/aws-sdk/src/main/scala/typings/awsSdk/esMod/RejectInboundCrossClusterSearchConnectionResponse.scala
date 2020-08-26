package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectInboundCrossClusterSearchConnectionResponse extends js.Object {
  /**
    * Specifies the InboundCrossClusterSearchConnection of rejected inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.native
}

object RejectInboundCrossClusterSearchConnectionResponse {
  @scala.inline
  def apply(): RejectInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionResponse]
  }
  @scala.inline
  implicit class RejectInboundCrossClusterSearchConnectionResponseOps[Self <: RejectInboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
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
    def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = this.set("CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossClusterSearchConnection: Self = this.set("CrossClusterSearchConnection", js.undefined)
  }
  
}

