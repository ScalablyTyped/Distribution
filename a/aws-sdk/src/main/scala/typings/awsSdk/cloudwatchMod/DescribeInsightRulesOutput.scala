package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInsightRulesOutput extends js.Object {
  
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
  implicit class DescribeInsightRulesOutputOps[Self <: DescribeInsightRulesOutput] (val x: Self) extends AnyVal {
    
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
    def setInsightRulesVarargs(value: InsightRule*): Self = this.set("InsightRules", js.Array(value :_*))
    
    @scala.inline
    def setInsightRules(value: InsightRules): Self = this.set("InsightRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightRules: Self = this.set("InsightRules", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
