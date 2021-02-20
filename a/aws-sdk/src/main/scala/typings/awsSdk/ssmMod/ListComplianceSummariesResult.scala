package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComplianceSummariesResult extends StObject {
  
  /**
    * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns State Manager associations, patches, or custom compliance types according to the filter criteria that you specified.
    */
  var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListComplianceSummariesResult {
  
  @scala.inline
  def apply(): ListComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceSummariesResult]
  }
  
  @scala.inline
  implicit class ListComplianceSummariesResultMutableBuilder[Self <: ListComplianceSummariesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceSummaryItems(value: ComplianceSummaryItemList): Self = StObject.set(x, "ComplianceSummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceSummaryItemsUndefined: Self = StObject.set(x, "ComplianceSummaryItems", js.undefined)
    
    @scala.inline
    def setComplianceSummaryItemsVarargs(value: ComplianceSummaryItem*): Self = StObject.set(x, "ComplianceSummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
