package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkBinding extends js.Object {
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.native
  /**
    * The port number on the container that is used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The port number on the host that is used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.native
}

object NetworkBinding {
  @scala.inline
  def apply(
    bindIP: String = null,
    containerPort: js.UndefOr[BoxedInteger] = js.undefined,
    hostPort: js.UndefOr[BoxedInteger] = js.undefined,
    protocol: TransportProtocol = null
  ): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    if (bindIP != null) __obj.updateDynamic("bindIP")(bindIP.asInstanceOf[js.Any])
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPort)) __obj.updateDynamic("hostPort")(hostPort.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkBinding]
  }
}

