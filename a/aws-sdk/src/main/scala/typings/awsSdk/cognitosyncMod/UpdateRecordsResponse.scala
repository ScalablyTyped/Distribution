package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRecordsResponse extends js.Object {
  /**
    * A list of records that have been updated.
    */
  var Records: js.UndefOr[RecordList] = js.native
}

object UpdateRecordsResponse {
  @scala.inline
  def apply(): UpdateRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRecordsResponse]
  }
  @scala.inline
  implicit class UpdateRecordsResponseOps[Self <: UpdateRecordsResponse] (val x: Self) extends AnyVal {
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
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: RecordList): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
  }
  
}

