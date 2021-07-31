package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestServiceQuotaIncreaseRequest extends StObject {
  
  /**
    * Specifies the value submitted in the service quota increase request. 
    */
  var DesiredValue: QuotaValue
  
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode
}
object RequestServiceQuotaIncreaseRequest {
  
  @scala.inline
  def apply(DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): RequestServiceQuotaIncreaseRequest = {
    val __obj = js.Dynamic.literal(DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
  }
  
  @scala.inline
  implicit class RequestServiceQuotaIncreaseRequestMutableBuilder[Self <: RequestServiceQuotaIncreaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
