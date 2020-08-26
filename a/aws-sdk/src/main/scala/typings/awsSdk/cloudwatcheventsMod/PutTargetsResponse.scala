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
  def apply(): PutTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTargetsResponse]
  }
  @scala.inline
  implicit class PutTargetsResponseOps[Self <: PutTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedEntriesVarargs(value: PutTargetsResultEntry*): Self = this.set("FailedEntries", js.Array(value :_*))
    @scala.inline
    def setFailedEntries(value: PutTargetsResultEntryList): Self = this.set("FailedEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEntries: Self = this.set("FailedEntries", js.undefined)
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = this.set("FailedEntryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEntryCount: Self = this.set("FailedEntryCount", js.undefined)
  }
  
}

