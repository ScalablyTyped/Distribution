package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends StObject {
  
  /**
    * Specifies the AWS Region for the quota. 
    */
  var AwsRegion: typings.awsSdk.servicequotasMod.AwsRegion
  
  /**
    * Specifies the new, increased value for the quota. 
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
object PutServiceQuotaIncreaseRequestIntoTemplateRequest {
  
  inline def apply(AwsRegion: AwsRegion, DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): PutServiceQuotaIncreaseRequestIntoTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateRequest]
  }
  
  extension [Self <: PutServiceQuotaIncreaseRequestIntoTemplateRequest](x: Self) {
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
