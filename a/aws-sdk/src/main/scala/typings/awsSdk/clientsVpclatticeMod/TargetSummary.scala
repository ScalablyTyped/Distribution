package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSummary extends StObject {
  
  /**
    * The ID of the target. If the target type of the target group is INSTANCE, this is an instance ID. If the target type is IP , this is an IP address. If the target type is LAMBDA, this is the ARN of the Lambda function. If the target type is ALB, this is the ARN of the Application Load Balancer.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The port on which the target is listening.
    */
  var port: js.UndefOr[Port] = js.undefined
  
  /**
    * The code for why the target status is what it is.
    */
  var reasonCode: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the target.    Draining: The target is being deregistered. No new connections will be sent to this target while current connections are being drained. Default draining time is 5 minutes.    Unavailable: Health checks are unavailable for the target group.    Healthy: The target is healthy.     Unhealthy: The target is unhealthy.    Initial: Initial health checks on the target are being performed.    Unused: Target group is not used in a service.  
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
}
object TargetSummary {
  
  inline def apply(): TargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetSummary] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
