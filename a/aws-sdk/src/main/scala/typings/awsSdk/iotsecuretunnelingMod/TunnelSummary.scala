package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TunnelSummary extends js.Object {
  /**
    * The time the tunnel was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The time the tunnel was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.native
  /**
    * The Amazon Resource Name of the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * The unique alpha-numeric identifier for the tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object TunnelSummary {
  @scala.inline
  def apply(): TunnelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelSummary]
  }
  @scala.inline
  implicit class TunnelSummaryOps[Self <: TunnelSummary] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: DateType): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setStatus(value: TunnelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTunnelArn(value: TunnelArn): Self = this.set("tunnelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelArn: Self = this.set("tunnelArn", js.undefined)
    @scala.inline
    def setTunnelId(value: TunnelId): Self = this.set("tunnelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelId: Self = this.set("tunnelId", js.undefined)
  }
  
}

