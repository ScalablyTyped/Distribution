package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortMapping extends js.Object {
  /**
    * The port number on the application.
    */
  var applicationPort: NonSystemPort = js.native
  /**
    * A Boolean indicating whether to enable this port mapping on public IP.
    */
  var enableOnPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * The port number on the simulation job instance to use as a remote connection point. 
    */
  var jobPort: Port = js.native
}

object PortMapping {
  @scala.inline
  def apply(
    applicationPort: NonSystemPort,
    jobPort: Port,
    enableOnPublicIp: js.UndefOr[scala.Boolean] = js.undefined
  ): PortMapping = {
    val __obj = js.Dynamic.literal(applicationPort = applicationPort.asInstanceOf[js.Any], jobPort = jobPort.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOnPublicIp)) __obj.updateDynamic("enableOnPublicIp")(enableOnPublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
}

