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
  /**
    * You can configure the action payload when you send a message to a Lambda function.
    */
  var payload: js.UndefOr[Payload] = js.native
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: AmazonResourceName, payload: Payload = null): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
}

