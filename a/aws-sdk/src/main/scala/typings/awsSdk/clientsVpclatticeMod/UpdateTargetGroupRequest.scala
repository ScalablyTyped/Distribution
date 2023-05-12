package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTargetGroupRequest extends StObject {
  
  /**
    * The health check configuration.
    */
  var healthCheck: HealthCheckConfig
  
  /**
    * The ID or Amazon Resource Name (ARN) of the target group.
    */
  var targetGroupIdentifier: TargetGroupIdentifier
}
object UpdateTargetGroupRequest {
  
  inline def apply(healthCheck: HealthCheckConfig, targetGroupIdentifier: TargetGroupIdentifier): UpdateTargetGroupRequest = {
    val __obj = js.Dynamic.literal(healthCheck = healthCheck.asInstanceOf[js.Any], targetGroupIdentifier = targetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTargetGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTargetGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setHealthCheck(value: HealthCheckConfig): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupIdentifier(value: TargetGroupIdentifier): Self = StObject.set(x, "targetGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
