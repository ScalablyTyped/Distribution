package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceResponse extends js.Object {
  /**
    * A complex type that contains information about the service.
    */
  var Service: js.UndefOr[typings.awsSdk.servicediscoveryMod.Service] = js.native
}

object GetServiceResponse {
  @scala.inline
  def apply(Service: Service = null): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (Service != null) __obj.updateDynamic("Service")(Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceResponse]
  }
}

