package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestedServiceQuotaChangeResponse extends js.Object {
  /**
    * Returns the RequestedServiceQuotaChange object for the specific increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.native
}

object GetRequestedServiceQuotaChangeResponse {
  @scala.inline
  def apply(): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
  @scala.inline
  implicit class GetRequestedServiceQuotaChangeResponseOps[Self <: GetRequestedServiceQuotaChangeResponse] (val x: Self) extends AnyVal {
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
    def setRequestedQuota(value: RequestedServiceQuotaChange): Self = this.set("RequestedQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedQuota: Self = this.set("RequestedQuota", js.undefined)
  }
  
}

