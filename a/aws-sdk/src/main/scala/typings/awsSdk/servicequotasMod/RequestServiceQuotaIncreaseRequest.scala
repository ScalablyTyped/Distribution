package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestServiceQuotaIncreaseRequest extends StObject {
  
  /**
    * The new, increased value for the quota.
    */
  var DesiredValue: QuotaValue
  
  /**
    * The quota identifier.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode
  
  /**
    * The service identifier.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode
}
object RequestServiceQuotaIncreaseRequest {
  
  inline def apply(DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): RequestServiceQuotaIncreaseRequest = {
    val __obj = js.Dynamic.literal(DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
  }
  
  extension [Self <: RequestServiceQuotaIncreaseRequest](x: Self) {
    
    inline def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
