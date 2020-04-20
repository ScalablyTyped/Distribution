package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTarget extends js.Object {
  /**
    * The ARN for the target action.
    */
  var ActionTargetArn: NonEmptyString = js.native
  /**
    * The description of the target action.
    */
  var Description: NonEmptyString = js.native
  /**
    * The name of the action target.
    */
  var Name: NonEmptyString = js.native
}

object ActionTarget {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString, Name: NonEmptyString): ActionTarget = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTarget]
  }
}

