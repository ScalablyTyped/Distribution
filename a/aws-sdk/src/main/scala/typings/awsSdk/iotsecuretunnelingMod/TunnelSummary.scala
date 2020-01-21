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
  def apply(
    createdAt: DateType = null,
    description: Description = null,
    lastUpdatedAt: DateType = null,
    status: TunnelStatus = null,
    tunnelArn: TunnelArn = null,
    tunnelId: TunnelId = null
  ): TunnelSummary = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tunnelArn != null) __obj.updateDynamic("tunnelArn")(tunnelArn.asInstanceOf[js.Any])
    if (tunnelId != null) __obj.updateDynamic("tunnelId")(tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TunnelSummary]
  }
}

