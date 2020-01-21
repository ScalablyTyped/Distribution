package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsByPlatformApplicationResponse extends js.Object {
  /**
    * Endpoints returned for ListEndpointsByPlatformApplication action.
    */
  var Endpoints: js.UndefOr[ListOfEndpoints] = js.native
  /**
    * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEndpointsByPlatformApplicationResponse {
  @scala.inline
  def apply(Endpoints: ListOfEndpoints = null, NextToken: String = null): ListEndpointsByPlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
  }
}

