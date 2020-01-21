package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaResponse extends js.Object {
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.native
}

object GetServiceQuotaResponse {
  @scala.inline
  def apply(Quota: ServiceQuota = null): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (Quota != null) __obj.updateDynamic("Quota")(Quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
}

