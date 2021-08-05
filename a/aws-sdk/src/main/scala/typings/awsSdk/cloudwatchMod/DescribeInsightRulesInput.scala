package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInsightRulesInput extends StObject {
  
  /**
    * The maximum number of results to return in one operation. If you omit this parameter, the default of 500 is used.
    */
  var MaxResults: js.UndefOr[InsightRuleMaxResults] = js.undefined
  
  /**
    * Include this value, if it was returned by the previous operation, to get the next set of rules.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object DescribeInsightRulesInput {
  
  inline def apply(): DescribeInsightRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesInput]
  }
  
  extension [Self <: DescribeInsightRulesInput](x: Self) {
    
    inline def setMaxResults(value: InsightRuleMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
