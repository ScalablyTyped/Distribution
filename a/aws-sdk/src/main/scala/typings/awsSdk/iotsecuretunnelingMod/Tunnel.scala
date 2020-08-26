package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tunnel extends js.Object {
  /**
    * The time when the tunnel was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration that specifies the thing name of the destination device and a service name that the local proxy uses to connect to the destination application.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * The connection state of the destination application.
    */
  var destinationConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The last time the tunnel was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The connection state of the source application.
    */
  var sourceConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.native
  /**
    * A list of tag metadata associated with the secure tunnel.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for the tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric ID that identifies a tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object Tunnel {
  @scala.inline
  def apply(): Tunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tunnel]
  }
  @scala.inline
  implicit class TunnelOps[Self <: Tunnel] (val x: Self) extends AnyVal {
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
    def setDestinationConfig(value: DestinationConfig): Self = this.set("destinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("destinationConfig", js.undefined)
    @scala.inline
    def setDestinationConnectionState(value: ConnectionState): Self = this.set("destinationConnectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConnectionState: Self = this.set("destinationConnectionState", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setSourceConnectionState(value: ConnectionState): Self = this.set("sourceConnectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceConnectionState: Self = this.set("sourceConnectionState", js.undefined)
    @scala.inline
    def setStatus(value: TunnelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = this.set("timeoutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutConfig: Self = this.set("timeoutConfig", js.undefined)
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

