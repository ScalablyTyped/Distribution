package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceActionOutput extends js.Object {
  /**
    * Detailed information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.native
}

object UpdateServiceActionOutput {
  @scala.inline
  def apply(ServiceActionDetail: ServiceActionDetail = null): UpdateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (ServiceActionDetail != null) __obj.updateDynamic("ServiceActionDetail")(ServiceActionDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceActionOutput]
  }
}

