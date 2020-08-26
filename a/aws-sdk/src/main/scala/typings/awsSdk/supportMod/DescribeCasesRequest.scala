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
    * Specifies whether to include communications in the DescribeCases response. By default, communications are incuded.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.native
  /**
    * Specifies whether to include resolved support cases in the DescribeCases response. By default, resolved cases aren't included.
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
  def apply(): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesRequest]
  }
  @scala.inline
  implicit class DescribeCasesRequestOps[Self <: DescribeCasesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterTime(value: AfterTime): Self = this.set("afterTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterTime: Self = this.set("afterTime", js.undefined)
    @scala.inline
    def setBeforeTime(value: BeforeTime): Self = this.set("beforeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTime: Self = this.set("beforeTime", js.undefined)
    @scala.inline
    def setCaseIdListVarargs(value: CaseId*): Self = this.set("caseIdList", js.Array(value :_*))
    @scala.inline
    def setCaseIdList(value: CaseIdList): Self = this.set("caseIdList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseIdList: Self = this.set("caseIdList", js.undefined)
    @scala.inline
    def setDisplayId(value: DisplayId): Self = this.set("displayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayId: Self = this.set("displayId", js.undefined)
    @scala.inline
    def setIncludeCommunications(value: IncludeCommunications): Self = this.set("includeCommunications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCommunications: Self = this.set("includeCommunications", js.undefined)
    @scala.inline
    def setIncludeResolvedCases(value: IncludeResolvedCases): Self = this.set("includeResolvedCases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeResolvedCases: Self = this.set("includeResolvedCases", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

