package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetAddress extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: typings.awsSdk.route53resolverMod.Ip = js.native
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typings.awsSdk.route53resolverMod.Port] = js.native
}

object TargetAddress {
  @scala.inline
  def apply(Ip: Ip, Port: js.UndefOr[Port] = js.undefined): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAddress]
  }
}

