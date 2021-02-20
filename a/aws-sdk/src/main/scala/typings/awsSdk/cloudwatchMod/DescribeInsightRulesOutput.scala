package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInsightRulesOutput extends StObject {
  
  /**
    * The rules returned by the operation.
    */
  var InsightRules: js.UndefOr[typings.awsSdk.cloudwatchMod.InsightRules] = js.native
  
  /**
    * If this parameter is present, it is a token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}
object DescribeInsightRulesOutput {
  
  @scala.inline
  def apply(): DescribeInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesOutput]
  }
  
  @scala.inline
  implicit class DescribeInsightRulesOutputMutableBuilder[Self <: DescribeInsightRulesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightRules(value: InsightRules): Self = StObject.set(x, "InsightRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightRulesUndefined: Self = StObject.set(x, "InsightRules", js.undefined)
    
    @scala.inline
    def setInsightRulesVarargs(value: InsightRule*): Self = StObject.set(x, "InsightRules", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
