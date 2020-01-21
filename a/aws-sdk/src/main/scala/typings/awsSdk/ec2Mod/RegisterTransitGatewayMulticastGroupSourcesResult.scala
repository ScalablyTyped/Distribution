package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
  /**
    * Information about the transit gateway multicast group sources.
    */
  var RegisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastRegisteredGroupSources] = js.native
}

object RegisterTransitGatewayMulticastGroupSourcesResult {
  @scala.inline
  def apply(RegisteredMulticastGroupSources: TransitGatewayMulticastRegisteredGroupSources = null): RegisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    if (RegisteredMulticastGroupSources != null) __obj.updateDynamic("RegisteredMulticastGroupSources")(RegisteredMulticastGroupSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupSourcesResult]
  }
}

