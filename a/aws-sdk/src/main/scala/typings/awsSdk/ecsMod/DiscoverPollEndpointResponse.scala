package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverPollEndpointResponse extends js.Object {
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.native
}

object DiscoverPollEndpointResponse {
  @scala.inline
  def apply(endpoint: String = null, telemetryEndpoint: String = null): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (telemetryEndpoint != null) __obj.updateDynamic("telemetryEndpoint")(telemetryEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
}

