package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainResponse extends js.Object {
  var DomainStatus: js.UndefOr[typings.awsSdk.cloudsearchMod.DomainStatus] = js.native
}

object DeleteDomainResponse {
  @scala.inline
  def apply(DomainStatus: DomainStatus = null): DeleteDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainResponse]
  }
}

