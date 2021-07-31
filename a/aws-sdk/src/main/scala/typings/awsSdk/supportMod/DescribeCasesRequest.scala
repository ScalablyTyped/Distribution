package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCasesRequest extends StObject {
  
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.undefined
  
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.undefined
  
  /**
    * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
    */
  var caseIdList: js.UndefOr[CaseIdList] = js.undefined
  
  /**
    * The ID displayed for a case in the AWS Support Center user interface.
    */
  var displayId: js.UndefOr[DisplayId] = js.undefined
  
  /**
    * Specifies whether to include communications in the DescribeCases response. By default, communications are incuded.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined
  
  /**
    * Specifies whether to include resolved support cases in the DescribeCases response. By default, resolved cases aren't included.
    */
  var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeCasesRequest {
  
  @scala.inline
  def apply(): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesRequest]
  }
  
  @scala.inline
  implicit class DescribeCasesRequestMutableBuilder[Self <: DescribeCasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTime(value: AfterTime): Self = StObject.set(x, "afterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTimeUndefined: Self = StObject.set(x, "afterTime", js.undefined)
    
    @scala.inline
    def setBeforeTime(value: BeforeTime): Self = StObject.set(x, "beforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeTimeUndefined: Self = StObject.set(x, "beforeTime", js.undefined)
    
    @scala.inline
    def setCaseIdList(value: CaseIdList): Self = StObject.set(x, "caseIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseIdListUndefined: Self = StObject.set(x, "caseIdList", js.undefined)
    
    @scala.inline
    def setCaseIdListVarargs(value: CaseId*): Self = StObject.set(x, "caseIdList", js.Array(value :_*))
    
    @scala.inline
    def setDisplayId(value: DisplayId): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    @scala.inline
    def setIncludeCommunications(value: IncludeCommunications): Self = StObject.set(x, "includeCommunications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCommunicationsUndefined: Self = StObject.set(x, "includeCommunications", js.undefined)
    
    @scala.inline
    def setIncludeResolvedCases(value: IncludeResolvedCases): Self = StObject.set(x, "includeResolvedCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResolvedCasesUndefined: Self = StObject.set(x, "includeResolvedCases", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
