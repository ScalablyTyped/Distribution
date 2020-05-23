package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMedicalVocabulariesRequest extends js.Object {
  /**
    * The maximum number of vocabularies to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * Returns vocabularies in the list whose name contains the specified string. The search is case-insensitive, ListMedicalVocabularies returns both "vocabularyname" and "VocabularyName" in the response list.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  /**
    * If the result of your previous request to ListMedicalVocabularies was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, only returns vocabularies with the VocabularyState equal to the specified vocabulary state.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}

object ListMedicalVocabulariesRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: VocabularyName = null,
    NextToken: NextToken = null,
    StateEquals: VocabularyState = null
  ): ListMedicalVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StateEquals != null) __obj.updateDynamic("StateEquals")(StateEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMedicalVocabulariesRequest]
  }
}

