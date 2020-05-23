package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFunctionEventInvokeConfigRequest extends js.Object {
  /**
    * A destination for events after they have been sent to a function for processing.  Destinations     Function - The Amazon Resource Name (ARN) of a Lambda function.    Queue - The ARN of an SQS queue.    Topic - The ARN of an SNS topic.    Event Bus - The ARN of an Amazon EventBridge event bus.  
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The maximum age of a request that Lambda sends to a function for processing.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumEventAgeInSeconds] = js.native
  /**
    * The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[typings.awsSdk.lambdaMod.MaximumRetryAttempts] = js.native
  /**
    * A version number or alias name.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.native
}

object UpdateFunctionEventInvokeConfigRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    DestinationConfig: DestinationConfig = null,
    MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
    MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined,
    Qualifier: Qualifier = null
  ): UpdateFunctionEventInvokeConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumEventAgeInSeconds)) __obj.updateDynamic("MaximumEventAgeInSeconds")(MaximumEventAgeInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumRetryAttempts)) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.get.asInstanceOf[js.Any])
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionEventInvokeConfigRequest]
  }
}

