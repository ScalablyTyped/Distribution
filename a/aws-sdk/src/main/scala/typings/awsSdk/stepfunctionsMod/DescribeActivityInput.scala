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
  @scala.inline
  implicit class DescribeActivityInputOps[Self <: DescribeActivityInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityArn(value: Arn): Self = this.set("activityArn", value.asInstanceOf[js.Any])
  }
  
}

