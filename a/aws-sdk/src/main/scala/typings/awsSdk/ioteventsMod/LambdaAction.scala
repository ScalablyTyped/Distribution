package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaAction extends StObject {
  
  /**
    * The ARN of the Lambda function that is executed.
    */
  var functionArn: AmazonResourceName
  
  /**
    * You can configure the action payload when you send a message to a Lambda function.
    */
  var payload: js.UndefOr[Payload] = js.undefined
}
object LambdaAction {
  
  inline def apply(functionArn: AmazonResourceName): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
  
  extension [Self <: LambdaAction](x: Self) {
    
    inline def setFunctionArn(value: AmazonResourceName): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
