package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfig extends js.Object {
  /**
    * A destination for events after they have been sent to a function for processing.  Destinations     Function - The Amazon Resource Name (ARN) of a Lambda function.    Queue - The ARN of an SQS queue.    Topic - The ARN of an SNS topic.    Event Bus - The ARN of an Amazon EventBridge event bus.  
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the function.
    */
  var FunctionArn: js.UndefOr[typings.awsSdk.lambdaMod.FunctionArn] = js.native
  /**
    * The date and time that the configuration was last updated.
    */
  var LastModified: js.UndefOr[Date] = js.native
  /**
    * The maximum age of a request that Lambda sends to a function for processing.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumEventAgeInSeconds] = js.native
  /**
    * The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[typings.awsSdk.lambdaMod.MaximumRetryAttempts] = js.native
}

object FunctionEventInvokeConfig {
  @scala.inline
  def apply(
    DestinationConfig: DestinationConfig = null,
    FunctionArn: FunctionArn = null,
    LastModified: Date = null,
    MaximumEventAgeInSeconds: Int | Double = null,
    MaximumRetryAttempts: Int | Double = null
  ): FunctionEventInvokeConfig = {
    val __obj = js.Dynamic.literal()
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (MaximumEventAgeInSeconds != null) __obj.updateDynamic("MaximumEventAgeInSeconds")(MaximumEventAgeInSeconds.asInstanceOf[js.Any])
    if (MaximumRetryAttempts != null) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfig]
  }
}

