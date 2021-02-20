package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceQuotaIncreaseRequestFromTemplateRequest extends StObject {
  
  /**
    * Specifies the AWS Region for the quota that you want to delete.
    */
  var AwsRegion: typings.awsSdk.servicequotasMod.AwsRegion = js.native
  
  /**
    * Specifies the code for the quota that you want to delete.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  
  /**
    * Specifies the code for the service that you want to delete.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}
object DeleteServiceQuotaIncreaseRequestFromTemplateRequest {
  
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): DeleteServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteServiceQuotaIncreaseRequestFromTemplateRequestMutableBuilder[Self <: DeleteServiceQuotaIncreaseRequestFromTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
