package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceCreditSpecificationRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the credit option for CPU usage.
    */
  var InstanceCreditSpecifications: InstanceCreditSpecificationListRequest
}
object ModifyInstanceCreditSpecificationRequest {
  
  inline def apply(InstanceCreditSpecifications: InstanceCreditSpecificationListRequest): ModifyInstanceCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceCreditSpecifications = InstanceCreditSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationRequest]
  }
  
  extension [Self <: ModifyInstanceCreditSpecificationRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceCreditSpecifications(value: InstanceCreditSpecificationListRequest): Self = StObject.set(x, "InstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreditSpecificationsVarargs(value: InstanceCreditSpecificationRequest*): Self = StObject.set(x, "InstanceCreditSpecifications", js.Array(value*))
  }
}
