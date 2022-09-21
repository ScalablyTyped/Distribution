package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceQuotaIncreaseRequestInTemplate extends StObject {
  
  /**
    * The AWS Region.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.servicequotasMod.AwsRegion] = js.undefined
  
  /**
    * The new, increased value of the quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  
  /**
    * Indicates whether the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.undefined
  
  /**
    * The quota identifier.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.undefined
  
  /**
    * The quota name.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.undefined
  
  /**
    * The service identifier.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.undefined
  
  /**
    * The service name.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.undefined
  
  /**
    * The unit of measurement.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}
object ServiceQuotaIncreaseRequestInTemplate {
  
  inline def apply(): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
  
  extension [Self <: ServiceQuotaIncreaseRequestInTemplate](x: Self) {
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    inline def setDesiredValueUndefined: Self = StObject.set(x, "DesiredValue", js.undefined)
    
    inline def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    inline def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
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
  }
}
