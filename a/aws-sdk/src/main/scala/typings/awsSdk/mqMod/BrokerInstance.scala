package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  /**
    * The URL of the broker's ActiveMQ Web Console.
    */
  var ConsoleURL: js.UndefOr[string] = js.native
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker.
    */
  var IpAddress: js.UndefOr[string] = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(ConsoleURL: string = null, Endpoints: listOfString = null, IpAddress: string = null): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    if (ConsoleURL != null) __obj.updateDynamic("ConsoleURL")(ConsoleURL.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstance]
  }
}

