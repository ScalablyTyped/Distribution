package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestServiceQuotaIncreaseRequest extends js.Object {
  /**
    * Specifies the value submitted in the service quota increase request. 
    */
  var DesiredValue: QuotaValue = js.native
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}

object RequestServiceQuotaIncreaseRequest {
  @scala.inline
  def apply(DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): RequestServiceQuotaIncreaseRequest = {
    val __obj = js.Dynamic.literal(DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
  }
  @scala.inline
  implicit class RequestServiceQuotaIncreaseRequestOps[Self <: RequestServiceQuotaIncreaseRequest] (val x: Self) extends AnyVal {
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
    def setDesiredValue(value: QuotaValue): Self = this.set("DesiredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
  }
  
}

