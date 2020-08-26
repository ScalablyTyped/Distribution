package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsRequest extends js.Object {
  /**
    * A collection of attributes that specify which findings you want to update.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  /**
    * The updated note for the finding.
    */
  var Note: js.UndefOr[NoteUpdate] = js.native
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[typings.awsSdk.securityhubMod.RecordState] = js.native
}

object UpdateFindingsRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  @scala.inline
  implicit class UpdateFindingsRequestOps[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: NoteUpdate): Self = this.set("Note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("Note", js.undefined)
    @scala.inline
    def setRecordState(value: RecordState): Self = this.set("RecordState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordState: Self = this.set("RecordState", js.undefined)
  }
  
}

