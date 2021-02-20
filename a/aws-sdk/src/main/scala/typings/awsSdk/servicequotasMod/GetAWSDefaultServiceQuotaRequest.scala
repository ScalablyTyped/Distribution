package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAWSDefaultServiceQuotaRequest extends StObject {
  
  /**
    * Identifies the service quota you want to select.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}
object GetAWSDefaultServiceQuotaRequest {
  
  @scala.inline
  def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetAWSDefaultServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaRequest]
  }
  
  @scala.inline
  implicit class GetAWSDefaultServiceQuotaRequestMutableBuilder[Self <: GetAWSDefaultServiceQuotaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
