package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFailure extends StObject {
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[String] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target. If the target type of the target group is INSTANCE, this is an instance ID. If the target type is IP , this is an IP address. If the target type is LAMBDA, this is the ARN of the Lambda function. If the target type is ALB, this is the ARN of the Application Load Balancer.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The port on which the target is listening. This parameter doesn't apply if the target is a Lambda function.
    */
  var port: js.UndefOr[Port] = js.undefined
}
object TargetFailure {
  
  inline def apply(): TargetFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetFailure] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
