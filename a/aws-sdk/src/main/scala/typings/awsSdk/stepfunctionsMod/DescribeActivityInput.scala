package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivityInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the activity to describe.
    */
  var activityArn: Arn = js.native
}

object DescribeActivityInput {
  @scala.inline
  def apply(activityArn: Arn): DescribeActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivityInput]
  }
}

