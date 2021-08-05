package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceQuota extends StObject {
  
  /**
    * Specifies if the quota value can be increased.
    */
  var Adjustable: js.UndefOr[QuotaAdjustable] = js.undefined
  
  /**
    * Specifies the ErrorCode and ErrorMessage when success isn't achieved.
    */
  var ErrorReason: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorReason] = js.undefined
  
  /**
    * Specifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.undefined
  
  /**
    * Identifies the unit and value of how time is measured.
    */
  var Period: js.UndefOr[QuotaPeriod] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaArn] = js.undefined
  
  /**
    * The code identifier for the service quota specified.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.undefined
  
  /**
    * The name identifier of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.undefined
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.undefined
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.undefined
  
  /**
    * The unit of measurement for the value of the service quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
  
  /**
    * Specifies the details about the measurement. 
    */
  var UsageMetric: js.UndefOr[MetricInfo] = js.undefined
  
  /**
    * The value of service quota.
    */
  var Value: js.UndefOr[QuotaValue] = js.undefined
}
object ServiceQuota {
  
  inline def apply(): ServiceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuota]
  }
  
  extension [Self <: ServiceQuota](x: Self) {
    
    inline def setAdjustable(value: QuotaAdjustable): Self = StObject.set(x, "Adjustable", value.asInstanceOf[js.Any])
    
    inline def setAdjustableUndefined: Self = StObject.set(x, "Adjustable", js.undefined)
    
    inline def setErrorReason(value: ErrorReason): Self = StObject.set(x, "ErrorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "ErrorReason", js.undefined)
    
    inline def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    inline def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    inline def setPeriod(value: QuotaPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setQuotaArn(value: QuotaArn): Self = StObject.set(x, "QuotaArn", value.asInstanceOf[js.Any])
    
    inline def setQuotaArnUndefined: Self = StObject.set(x, "QuotaArn", js.undefined)
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    inline def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    inline def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setUsageMetric(value: MetricInfo): Self = StObject.set(x, "UsageMetric", value.asInstanceOf[js.Any])
    
    inline def setUsageMetricUndefined: Self = StObject.set(x, "UsageMetric", js.undefined)
    
    inline def setValue(value: QuotaValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
