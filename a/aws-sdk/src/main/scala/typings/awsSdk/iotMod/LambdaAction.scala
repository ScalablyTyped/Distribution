package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: FunctionArn = js.native
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: FunctionArn): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LambdaAction]
  }
}

