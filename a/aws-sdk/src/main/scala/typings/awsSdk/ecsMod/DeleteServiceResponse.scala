package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceResponse extends js.Object {
  /**
    * The full description of the deleted service.
    */
  var service: js.UndefOr[Service] = js.native
}

object DeleteServiceResponse {
  @scala.inline
  def apply(service: Service = null): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceResponse]
  }
}

