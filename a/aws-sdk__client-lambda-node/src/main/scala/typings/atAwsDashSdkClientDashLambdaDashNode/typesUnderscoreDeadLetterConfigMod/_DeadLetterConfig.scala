package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreDeadLetterConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeadLetterConfig extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.</p>
    */
  var TargetArn: js.UndefOr[String] = js.undefined
}

object _DeadLetterConfig {
  @scala.inline
  def apply(TargetArn: String = null): _DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn)
    __obj.asInstanceOf[_DeadLetterConfig]
  }
}

