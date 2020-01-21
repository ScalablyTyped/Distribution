package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
  /**
    * Information about the deregistered group sources.
    */
  var DeregisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastDeregisteredGroupSources] = js.native
}

object DeregisterTransitGatewayMulticastGroupSourcesResult {
  @scala.inline
  def apply(DeregisteredMulticastGroupSources: TransitGatewayMulticastDeregisteredGroupSources = null): DeregisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    if (DeregisteredMulticastGroupSources != null) __obj.updateDynamic("DeregisteredMulticastGroupSources")(DeregisteredMulticastGroupSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupSourcesResult]
  }
}

