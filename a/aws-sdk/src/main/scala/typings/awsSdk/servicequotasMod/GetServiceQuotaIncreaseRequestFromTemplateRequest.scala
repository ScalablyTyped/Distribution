package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: typings.awsSdk.servicequotasMod.AwsRegion = js.native
  /**
    * Specifies the quota you want.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}

object GetServiceQuotaIncreaseRequestFromTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
  }
  @scala.inline
  implicit class GetServiceQuotaIncreaseRequestFromTemplateRequestOps[Self <: GetServiceQuotaIncreaseRequestFromTemplateRequest] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
  }
  
}

