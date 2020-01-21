package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomActionTypeOutput extends js.Object {
  /**
    * Returns information about the details of an action type.
    */
  var actionType: ActionType = js.native
  /**
    * Specifies the tags applied to the custom action.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateCustomActionTypeOutput {
  @scala.inline
  def apply(actionType: ActionType, tags: TagList = null): CreateCustomActionTypeOutput = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeOutput]
  }
}

