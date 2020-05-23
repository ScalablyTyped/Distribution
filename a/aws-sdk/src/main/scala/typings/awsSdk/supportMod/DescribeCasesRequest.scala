package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCasesRequest extends js.Object {
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.native
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.native
  /**
    * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
    */
  var caseIdList: js.UndefOr[CaseIdList] = js.native
  /**
    * The ID displayed for a case in the AWS Support Center user interface.
    */
  var displayId: js.UndefOr[DisplayId] = js.native
  /**
    * Specifies whether communications should be included in the DescribeCases results. The default is true.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.native
  /**
    * Specifies whether resolved support cases should be included in the DescribeCases results. The default is false.
    */
  var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCasesRequest {
  @scala.inline
  def apply(
    afterTime: AfterTime = null,
    beforeTime: BeforeTime = null,
    caseIdList: CaseIdList = null,
    displayId: DisplayId = null,
    includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined,
    includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined,
    language: Language = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    if (afterTime != null) __obj.updateDynamic("afterTime")(afterTime.asInstanceOf[js.Any])
    if (beforeTime != null) __obj.updateDynamic("beforeTime")(beforeTime.asInstanceOf[js.Any])
    if (caseIdList != null) __obj.updateDynamic("caseIdList")(caseIdList.asInstanceOf[js.Any])
    if (displayId != null) __obj.updateDynamic("displayId")(displayId.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCommunications)) __obj.updateDynamic("includeCommunications")(includeCommunications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResolvedCases)) __obj.updateDynamic("includeResolvedCases")(includeResolvedCases.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCasesRequest]
  }
}

