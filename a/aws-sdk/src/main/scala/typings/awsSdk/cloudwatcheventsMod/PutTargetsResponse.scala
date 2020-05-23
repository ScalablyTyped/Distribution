package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTargetsResponse extends js.Object {
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.native
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object PutTargetsResponse {
  @scala.inline
  def apply(
    FailedEntries: PutTargetsResultEntryList = null,
    FailedEntryCount: js.UndefOr[Integer] = js.undefined
  ): PutTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedEntries != null) __obj.updateDynamic("FailedEntries")(FailedEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedEntryCount)) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsResponse]
  }
}

