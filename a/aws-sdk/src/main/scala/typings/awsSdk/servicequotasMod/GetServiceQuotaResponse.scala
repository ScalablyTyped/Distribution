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
  def apply(): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
  @scala.inline
  implicit class GetServiceQuotaResponseOps[Self <: GetServiceQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuota(value: ServiceQuota): Self = this.set("Quota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota: Self = this.set("Quota", js.undefined)
  }
  
}

