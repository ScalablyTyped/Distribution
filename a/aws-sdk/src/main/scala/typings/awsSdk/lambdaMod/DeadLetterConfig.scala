package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeadLetterConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[ResourceArn] = js.native
}

object DeadLetterConfig {
  @scala.inline
  def apply(TargetArn: ResourceArn = null): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeadLetterConfig]
  }
}

