package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabularyFiltersResponse extends js.Object {
  /**
    * The ListVocabularyFilters operation returns a page of collections at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListVocabularyFilters operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * The list of vocabulary filters. It contains at most MaxResults number of filters. If there are more filters, call the ListVocabularyFilters operation again with the NextToken parameter in the request set to the value of the NextToken field in the response.
    */
  var VocabularyFilters: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilters] = js.native
}

object ListVocabularyFiltersResponse {
  @scala.inline
  def apply(): ListVocabularyFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabularyFiltersResponse]
  }
  @scala.inline
  implicit class ListVocabularyFiltersResponseOps[Self <: ListVocabularyFiltersResponse] (val x: Self) extends AnyVal {
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
    def setVocabularyFiltersVarargs(value: VocabularyFilterInfo*): Self = this.set("VocabularyFilters", js.Array(value :_*))
    @scala.inline
    def setVocabularyFilters(value: VocabularyFilters): Self = this.set("VocabularyFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocabularyFilters: Self = this.set("VocabularyFilters", js.undefined)
  }
  
}

