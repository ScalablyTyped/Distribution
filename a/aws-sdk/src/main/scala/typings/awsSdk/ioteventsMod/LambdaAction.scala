package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaAction extends StObject {
  
  /**
    * The ARN of the Lambda function that is executed.
    */
  var functionArn: AmazonResourceName = js.native
  
  /**
    * You can configure the action payload when you send a message to a Lambda function.
    */
  var payload: js.UndefOr[Payload] = js.native
}
object LambdaAction {
  
  @scala.inline
  def apply(functionArn: AmazonResourceName): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
  
  @scala.inline
  implicit class LambdaActionMutableBuilder[Self <: LambdaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: AmazonResourceName): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
