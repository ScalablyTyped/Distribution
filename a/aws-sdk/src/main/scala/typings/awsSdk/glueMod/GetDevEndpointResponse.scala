package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointResponse extends js.Object {
  /**
    * A DevEndpoint definition.
    */
  var DevEndpoint: js.UndefOr[typings.awsSdk.glueMod.DevEndpoint] = js.native
}

object GetDevEndpointResponse {
  @scala.inline
  def apply(DevEndpoint: DevEndpoint = null): GetDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoint != null) __obj.updateDynamic("DevEndpoint")(DevEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEndpointResponse]
  }
}

