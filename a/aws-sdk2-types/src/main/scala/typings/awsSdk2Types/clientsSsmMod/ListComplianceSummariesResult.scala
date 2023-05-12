package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComplianceSummariesResult extends StObject {
  
  /**
    * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns State Manager associations, patches, or custom compliance types according to the filter criteria that you specified.
    */
  var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
}
object ListComplianceSummariesResult {
  
  inline def apply(): ListComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceSummariesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComplianceSummariesResult] (val x: Self) extends AnyVal {
    
    inline def setComplianceSummaryItems(value: ComplianceSummaryItemList): Self = StObject.set(x, "ComplianceSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummaryItemsUndefined: Self = StObject.set(x, "ComplianceSummaryItems", js.undefined)
    
    inline def setComplianceSummaryItemsVarargs(value: ComplianceSummaryItem*): Self = StObject.set(x, "ComplianceSummaryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
