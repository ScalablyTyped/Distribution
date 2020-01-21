package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointResponse extends js.Object {
  /**
    * The endpoint that was deleted.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.dmsMod.Endpoint] = js.native
}

object DeleteEndpointResponse {
  @scala.inline
  def apply(Endpoint: Endpoint = null): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
}

