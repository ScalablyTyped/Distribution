package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceQuota extends StObject {
  
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
  implicit class ServiceQuotaMutableBuilder[Self <: ServiceQuota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustable(value: QuotaAdjustable): Self = StObject.set(x, "Adjustable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustableUndefined: Self = StObject.set(x, "Adjustable", js.undefined)
    
    @scala.inline
    def setErrorReason(value: ErrorReason): Self = StObject.set(x, "ErrorReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorReasonUndefined: Self = StObject.set(x, "ErrorReason", js.undefined)
    
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    @scala.inline
    def setPeriod(value: QuotaPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setQuotaArn(value: QuotaArn): Self = StObject.set(x, "QuotaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaArnUndefined: Self = StObject.set(x, "QuotaArn", js.undefined)
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    @scala.inline
    def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    @scala.inline
    def setUsageMetric(value: MetricInfo): Self = StObject.set(x, "UsageMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageMetricUndefined: Self = StObject.set(x, "UsageMetric", js.undefined)
    
    @scala.inline
    def setValue(value: QuotaValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
