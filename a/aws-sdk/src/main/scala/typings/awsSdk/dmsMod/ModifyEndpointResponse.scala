package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEndpointResponse extends js.Object {
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.dmsMod.Endpoint] = js.native
}

object ModifyEndpointResponse {
  @scala.inline
  def apply(Endpoint: Endpoint = null): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
}

