package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabulariesRequest extends js.Object {
  /**
    * The maximum number of vocabularies to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * When specified, the vocabularies returned in the list are limited to vocabularies whose name contains the specified string. The search is case-insensitive, ListVocabularies returns both "vocabularyname" and "VocabularyName" in the response list.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  /**
    * If the result of the previous request to ListVocabularies was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, only returns vocabularies with the VocabularyState field equal to the specified state.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}

object ListVocabulariesRequest {
  @scala.inline
  def apply(): ListVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesRequest]
  }
  @scala.inline
  implicit class ListVocabulariesRequestOps[Self <: ListVocabulariesRequest] (val x: Self) extends AnyVal {
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
    def setNameContains(value: VocabularyName): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStateEquals(value: VocabularyState): Self = this.set("StateEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateEquals: Self = this.set("StateEquals", js.undefined)
  }
  
}

