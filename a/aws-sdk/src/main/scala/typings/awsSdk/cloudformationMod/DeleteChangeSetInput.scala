package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * If you specified the name of a change set to delete, specify the stack name or ID (ARN) that is associated with it.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

object DeleteChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId, StackName: StackNameOrId = null): DeleteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChangeSetInput]
  }
}

