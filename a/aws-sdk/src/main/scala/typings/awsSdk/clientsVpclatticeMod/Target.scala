package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * The ID of the target. If the target type of the target group is INSTANCE, this is an instance ID. If the target type is IP , this is an IP address. If the target type is LAMBDA, this is the ARN of the Lambda function. If the target type is ALB, this is the ARN of the Application Load Balancer.
    */
  var id: TargetIdString
  
  /**
    * The port on which the target is listening. For HTTP, the default is 80. For HTTPS, the default is 443.
    */
  var port: js.UndefOr[Port] = js.undefined
}
object Target {
  
  inline def apply(id: TargetIdString): Target = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setId(value: TargetIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
