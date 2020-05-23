package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionScheduledEventDetails extends js.Object {
  /**
    * The JSON data input to the lambda function.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled lambda function.
    */
  var resource: Arn = js.native
  /**
    * The maximum allowed duration of the lambda function.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object LambdaFunctionScheduledEventDetails {
  @scala.inline
  def apply(
    resource: Arn,
    input: SensitiveData = null,
    timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  ): LambdaFunctionScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
  }
}

