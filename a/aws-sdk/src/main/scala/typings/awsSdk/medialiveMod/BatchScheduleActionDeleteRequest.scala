package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionDeleteRequest extends js.Object {
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: listOfString = js.native
}

object BatchScheduleActionDeleteRequest {
  @scala.inline
  def apply(ActionNames: listOfString): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
}

