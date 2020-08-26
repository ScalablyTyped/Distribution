package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTargetsResponse extends js.Object {
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.native
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object RemoveTargetsResponse {
  @scala.inline
  def apply(): RemoveTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetsResponse]
  }
  @scala.inline
  implicit class RemoveTargetsResponseOps[Self <: RemoveTargetsResponse] (val x: Self) extends AnyVal {
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
    def setFailedEntriesVarargs(value: RemoveTargetsResultEntry*): Self = this.set("FailedEntries", js.Array(value :_*))
    @scala.inline
    def setFailedEntries(value: RemoveTargetsResultEntryList): Self = this.set("FailedEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEntries: Self = this.set("FailedEntries", js.undefined)
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = this.set("FailedEntryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEntryCount: Self = this.set("FailedEntryCount", js.undefined)
  }
  
}

