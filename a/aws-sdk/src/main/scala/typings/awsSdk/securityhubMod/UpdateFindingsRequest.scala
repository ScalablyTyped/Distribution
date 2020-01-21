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
  def apply(Filters: AwsSecurityFindingFilters, Note: NoteUpdate = null, RecordState: RecordState = null): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    if (Note != null) __obj.updateDynamic("Note")(Note.asInstanceOf[js.Any])
    if (RecordState != null) __obj.updateDynamic("RecordState")(RecordState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
}

