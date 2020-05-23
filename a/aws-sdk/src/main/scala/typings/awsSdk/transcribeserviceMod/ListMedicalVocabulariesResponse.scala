package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMedicalVocabulariesResponse extends js.Object {
  /**
    * The ListMedicalVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe Medical returns the NextPage token. Include the token in the next request to the ListMedicalVocabularies operation to return the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[VocabularyState] = js.native
  /**
    * A list of objects that describe the vocabularies that match the search criteria in the request.
    */
  var Vocabularies: js.UndefOr[typings.awsSdk.transcribeserviceMod.Vocabularies] = js.native
}

object ListMedicalVocabulariesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Status: VocabularyState = null, Vocabularies: Vocabularies = null): ListMedicalVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Vocabularies != null) __obj.updateDynamic("Vocabularies")(Vocabularies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMedicalVocabulariesResponse]
  }
}

