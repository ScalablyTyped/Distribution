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
  def apply(
    Adjustable: js.UndefOr[Boolean] = js.undefined,
    ErrorReason: ErrorReason = null,
    GlobalQuota: js.UndefOr[Boolean] = js.undefined,
    Period: QuotaPeriod = null,
    QuotaArn: QuotaArn = null,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Unit: QuotaUnit = null,
    UsageMetric: MetricInfo = null,
    Value: Int | Double = null
  ): ServiceQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Adjustable)) __obj.updateDynamic("Adjustable")(Adjustable.asInstanceOf[js.Any])
    if (ErrorReason != null) __obj.updateDynamic("ErrorReason")(ErrorReason.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (QuotaArn != null) __obj.updateDynamic("QuotaArn")(QuotaArn.asInstanceOf[js.Any])
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode.asInstanceOf[js.Any])
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (UsageMetric != null) __obj.updateDynamic("UsageMetric")(UsageMetric.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceQuota]
  }
}

