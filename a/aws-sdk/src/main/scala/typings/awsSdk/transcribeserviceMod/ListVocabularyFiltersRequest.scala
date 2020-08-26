package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabularyFiltersRequest extends js.Object {
  /**
    * The maximum number of filters to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
    */
  var NameContains: js.UndefOr[VocabularyFilterName] = js.native
  /**
    * If the result of the previous request to ListVocabularyFilters was truncated, include the NextToken to fetch the next set of collections.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
}

object ListVocabularyFiltersRequest {
  @scala.inline
  def apply(): ListVocabularyFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabularyFiltersRequest]
  }
  @scala.inline
  implicit class ListVocabularyFiltersRequestOps[Self <: ListVocabularyFiltersRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNameContains(value: VocabularyFilterName): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

