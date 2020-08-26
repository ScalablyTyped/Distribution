package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaRequest extends js.Object {
  /**
    * Identifies the service quota you want to select.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}

object GetServiceQuotaRequest {
  @scala.inline
  def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaRequest]
  }
  @scala.inline
  implicit class GetServiceQuotaRequestOps[Self <: GetServiceQuotaRequest] (val x: Self) extends AnyVal {
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
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
  }
  
}

