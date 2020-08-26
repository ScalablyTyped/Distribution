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
  def apply(): ListMedicalVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalVocabulariesResponse]
  }
  @scala.inline
  implicit class ListMedicalVocabulariesResponseOps[Self <: ListMedicalVocabulariesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatus(value: VocabularyState): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVocabulariesVarargs(value: VocabularyInfo*): Self = this.set("Vocabularies", js.Array(value :_*))
    @scala.inline
    def setVocabularies(value: Vocabularies): Self = this.set("Vocabularies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularies: Self = this.set("Vocabularies", js.undefined)
  }
  
}

