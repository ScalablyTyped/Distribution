package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteActivityInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the activity to delete.
    */
  var activityArn: Arn = js.native
}

object DeleteActivityInput {
  @scala.inline
  def apply(activityArn: Arn): DeleteActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteActivityInput]
  }
}

