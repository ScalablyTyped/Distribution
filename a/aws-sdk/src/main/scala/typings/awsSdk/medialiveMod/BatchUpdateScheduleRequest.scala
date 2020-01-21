package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string = js.native
  /**
    * Schedule actions to create in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.native
  /**
    * Schedule actions to delete from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.native
}

object BatchUpdateScheduleRequest {
  @scala.inline
  def apply(
    ChannelId: string,
    Creates: BatchScheduleActionCreateRequest = null,
    Deletes: BatchScheduleActionDeleteRequest = null
  ): BatchUpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    if (Creates != null) __obj.updateDynamic("Creates")(Creates.asInstanceOf[js.Any])
    if (Deletes != null) __obj.updateDynamic("Deletes")(Deletes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateScheduleRequest]
  }
}

