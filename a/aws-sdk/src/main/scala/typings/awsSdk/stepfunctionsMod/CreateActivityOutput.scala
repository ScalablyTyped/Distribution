package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActivityOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the created activity.
    */
  var activityArn: Arn = js.native
  /**
    * The date the activity is created.
    */
  var creationDate: Timestamp = js.native
}

object CreateActivityOutput {
  @scala.inline
  def apply(activityArn: Arn, creationDate: Timestamp): CreateActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivityOutput]
  }
  @scala.inline
  implicit class CreateActivityOutputOps[Self <: CreateActivityOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
  }
  
}

