package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckStatusRequest extends StObject {
  
  /**
    * The ID for the health check that you want the current status for. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to check the status of a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckStatus to get the status of a calculated health check. 
    */
  var HealthCheckId: typings.awsSdk.route53Mod.HealthCheckId
}
object GetHealthCheckStatusRequest {
  
  inline def apply(HealthCheckId: HealthCheckId): GetHealthCheckStatusRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckStatusRequest]
  }
  
  extension [Self <: GetHealthCheckStatusRequest](x: Self) {
    
    inline def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
