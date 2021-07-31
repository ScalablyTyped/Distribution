package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaAction extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: FunctionArn
}
object LambdaAction {
  
  @scala.inline
  def apply(functionArn: FunctionArn): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
  
  @scala.inline
  implicit class LambdaActionMutableBuilder[Self <: LambdaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
