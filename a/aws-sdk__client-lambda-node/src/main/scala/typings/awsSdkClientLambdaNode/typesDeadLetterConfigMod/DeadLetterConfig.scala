package typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeadLetterConfig extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.</p>
    */
  var TargetArn: js.UndefOr[String] = js.undefined
}

object DeadLetterConfig {
  @scala.inline
  def apply(TargetArn: String = null): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeadLetterConfig]
  }
}

