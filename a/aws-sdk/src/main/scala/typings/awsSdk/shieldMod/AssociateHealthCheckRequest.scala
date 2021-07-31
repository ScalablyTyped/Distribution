package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateHealthCheckRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the health check to associate with the protection.
    */
  var HealthCheckArn: typings.awsSdk.shieldMod.HealthCheckArn
  
  /**
    * The unique identifier (ID) for the Protection object to add the health check association to. 
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId
}
object AssociateHealthCheckRequest {
  
  @scala.inline
  def apply(HealthCheckArn: HealthCheckArn, ProtectionId: ProtectionId): AssociateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckArn = HealthCheckArn.asInstanceOf[js.Any], ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateHealthCheckRequest]
  }
  
  @scala.inline
  implicit class AssociateHealthCheckRequestMutableBuilder[Self <: AssociateHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckArn(value: HealthCheckArn): Self = StObject.set(x, "HealthCheckArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
  }
}
