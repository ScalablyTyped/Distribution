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
  def apply(InitialContactId: ContactId = null, NextToken: NextToken = null, Transcript: Transcript = null): GetTranscriptResponse = {
    val __obj = js.Dynamic.literal()
    if (InitialContactId != null) __obj.updateDynamic("InitialContactId")(InitialContactId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Transcript != null) __obj.updateDynamic("Transcript")(Transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptResponse]
  }
}

