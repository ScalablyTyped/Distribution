package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuota extends js.Object {
  /**
    * Specifies if the quota value can be increased.
    */
  var Adjustable: js.UndefOr[QuotaAdjustable] = js.native
  /**
    * Specifies the ErrorCode and ErrorMessage when success isn't achieved.
    */
  var ErrorReason: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorReason] = js.native
  /**
    * Specifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.native
  /**
    * Identifies the unit and value of how time is measured.
    */
  var Period: js.UndefOr[QuotaPeriod] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaArn] = js.native
  /**
    * The code identifier for the service quota specified.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.native
  /**
    * The name identifier of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.native
  /**
    * The unit of measurement for the value of the service quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
  /**
    * Specifies the details about the measurement. 
    */
  var UsageMetric: js.UndefOr[MetricInfo] = js.native
  /**
    * The value of service quota.
    */
  var Value: js.UndefOr[QuotaValue] = js.native
}

object ServiceQuota {
  @scala.inline
  def apply(): ServiceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuota]
  }
  @scala.inline
  implicit class ServiceQuotaOps[Self <: ServiceQuota] (val x: Self) extends AnyVal {
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
    def setAdjustable(value: QuotaAdjustable): Self = this.set("Adjustable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustable: Self = this.set("Adjustable", js.undefined)
    @scala.inline
    def setErrorReason(value: ErrorReason): Self = this.set("ErrorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReason: Self = this.set("ErrorReason", js.undefined)
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = this.set("GlobalQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalQuota: Self = this.set("GlobalQuota", js.undefined)
    @scala.inline
    def setPeriod(value: QuotaPeriod): Self = this.set("Period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    @scala.inline
    def setQuotaArn(value: QuotaArn): Self = this.set("QuotaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaArn: Self = this.set("QuotaArn", js.undefined)
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaCode: Self = this.set("QuotaCode", js.undefined)
    @scala.inline
    def setQuotaName(value: QuotaName): Self = this.set("QuotaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaName: Self = this.set("QuotaName", js.undefined)
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    @scala.inline
    def setUnit(value: QuotaUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
    @scala.inline
    def setUsageMetric(value: MetricInfo): Self = this.set("UsageMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageMetric: Self = this.set("UsageMetric", js.undefined)
    @scala.inline
    def setValue(value: QuotaValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

