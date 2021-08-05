package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateHealthCheckRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the health check that is associated with the protection.
    */
  var HealthCheckArn: typings.awsSdk.shieldMod.HealthCheckArn
  
  /**
    * The unique identifier (ID) for the Protection object to remove the health check association from. 
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId
}
object DisassociateHealthCheckRequest {
  
  inline def apply(HealthCheckArn: HealthCheckArn, ProtectionId: ProtectionId): DisassociateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckArn = HealthCheckArn.asInstanceOf[js.Any], ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateHealthCheckRequest]
  }
  
  extension [Self <: DisassociateHealthCheckRequest](x: Self) {
    
    inline def setHealthCheckArn(value: HealthCheckArn): Self = StObject.set(x, "HealthCheckArn", value.asInstanceOf[js.Any])
    
    inline def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
  }
}
