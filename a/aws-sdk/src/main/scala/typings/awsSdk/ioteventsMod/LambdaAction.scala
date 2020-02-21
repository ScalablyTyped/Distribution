package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function that is executed.
    */
  var functionArn: AmazonResourceName = js.native
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: AmazonResourceName): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LambdaAction]
  }
}

