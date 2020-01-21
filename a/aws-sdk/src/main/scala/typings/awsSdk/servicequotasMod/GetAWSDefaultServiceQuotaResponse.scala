package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAWSDefaultServiceQuotaResponse extends js.Object {
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.native
}

object GetAWSDefaultServiceQuotaResponse {
  @scala.inline
  def apply(Quota: ServiceQuota = null): GetAWSDefaultServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (Quota != null) __obj.updateDynamic("Quota")(Quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaResponse]
  }
}

