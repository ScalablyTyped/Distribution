package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionDeadLetterConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionDeadLetterConfig {
  @scala.inline
  def apply(TargetArn: NonEmptyString = null): AwsLambdaFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
  }
}

