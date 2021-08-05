package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOpsItemsResponse extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of OpsItems.
    */
  var OpsItemSummaries: js.UndefOr[typings.awsSdk.ssmMod.OpsItemSummaries] = js.undefined
}
object DescribeOpsItemsResponse {
  
  inline def apply(): DescribeOpsItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOpsItemsResponse]
  }
  
  extension [Self <: DescribeOpsItemsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOpsItemSummaries(value: OpsItemSummaries): Self = StObject.set(x, "OpsItemSummaries", value.asInstanceOf[js.Any])
    
    inline def setOpsItemSummariesUndefined: Self = StObject.set(x, "OpsItemSummaries", js.undefined)
    
    inline def setOpsItemSummariesVarargs(value: OpsItemSummary*): Self = StObject.set(x, "OpsItemSummaries", js.Array(value :_*))
  }
}
