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
  def apply(): FunctionEventInvokeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfig]
  }
  @scala.inline
  implicit class FunctionEventInvokeConfigOps[Self <: FunctionEventInvokeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = this.set("DestinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("DestinationConfig", js.undefined)
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionArn: Self = this.set("FunctionArn", js.undefined)
    @scala.inline
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setMaximumEventAgeInSeconds(value: MaximumEventAgeInSeconds): Self = this.set("MaximumEventAgeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumEventAgeInSeconds: Self = this.set("MaximumEventAgeInSeconds", js.undefined)
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttempts): Self = this.set("MaximumRetryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("MaximumRetryAttempts", js.undefined)
  }
  
}

