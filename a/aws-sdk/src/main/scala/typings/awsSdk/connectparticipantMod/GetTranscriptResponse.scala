package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptResponse extends js.Object {
  /**
    * The initial contact ID for the contact. 
    */
  var InitialContactId: js.UndefOr[ContactId] = js.native
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectparticipantMod.NextToken] = js.native
  /**
    * The list of messages in the session.
    */
  var Transcript: js.UndefOr[typings.awsSdk.connectparticipantMod.Transcript] = js.native
}

object GetTranscriptResponse {
  @scala.inline
  def apply(): GetTranscriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptResponse]
  }
  @scala.inline
  implicit class GetTranscriptResponseOps[Self <: GetTranscriptResponse] (val x: Self) extends AnyVal {
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
    def setInitialContactId(value: ContactId): Self = this.set("InitialContactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialContactId: Self = this.set("InitialContactId", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTranscriptVarargs(value: Item*): Self = this.set("Transcript", js.Array(value :_*))
    @scala.inline
    def setTranscript(value: Transcript): Self = this.set("Transcript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscript: Self = this.set("Transcript", js.undefined)
  }
  
}

