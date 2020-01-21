package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelRequest extends js.Object {
  /**
    * A short text description of the tunnel. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration for the OpenTunnel request.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * A collection of tag metadata.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for a tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object OpenTunnelRequest {
  @scala.inline
  def apply(
    description: Description = null,
    destinationConfig: DestinationConfig = null,
    tags: TagList = null,
    timeoutConfig: TimeoutConfig = null
  ): OpenTunnelRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinationConfig != null) __obj.updateDynamic("destinationConfig")(destinationConfig.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTunnelRequest]
  }
}

