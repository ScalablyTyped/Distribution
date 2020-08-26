package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptRequest extends js.Object {
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The contactId from the current contact chain for which transcript is needed.
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectparticipantMod.ContactId] = js.native
  /**
    * The maximum number of results to return in the page. Default: 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.connectparticipantMod.MaxResults] = js.native
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectparticipantMod.NextToken] = js.native
  /**
    * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is provided, FORWARD with StartPosition. 
    */
  var ScanDirection: js.UndefOr[typings.awsSdk.connectparticipantMod.ScanDirection] = js.native
  /**
    * The sort order for the records. Default: DESCENDING.
    */
  var SortOrder: js.UndefOr[SortKey] = js.native
  /**
    * A filtering option for where to start.
    */
  var StartPosition: js.UndefOr[typings.awsSdk.connectparticipantMod.StartPosition] = js.native
}

object GetTranscriptRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken): GetTranscriptRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptRequest]
  }
  @scala.inline
  implicit class GetTranscriptRequestOps[Self <: GetTranscriptRequest] (val x: Self) extends AnyVal {
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
    def setConnectionToken(value: ParticipantToken): Self = this.set("ConnectionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactId(value: ContactId): Self = this.set("ContactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactId: Self = this.set("ContactId", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScanDirection(value: ScanDirection): Self = this.set("ScanDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanDirection: Self = this.set("ScanDirection", js.undefined)
    @scala.inline
    def setSortOrder(value: SortKey): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setStartPosition(value: StartPosition): Self = this.set("StartPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("StartPosition", js.undefined)
  }
  
}

