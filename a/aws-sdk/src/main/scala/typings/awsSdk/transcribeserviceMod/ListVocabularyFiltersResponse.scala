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
  def apply(NextToken: NextToken = null, VocabularyFilters: VocabularyFilters = null): ListVocabularyFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VocabularyFilters != null) __obj.updateDynamic("VocabularyFilters")(VocabularyFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVocabularyFiltersResponse]
  }
}

