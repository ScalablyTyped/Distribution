package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePackComplianceResponse extends js.Object {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  
  /**
    * Returns a list of ConformancePackRuleCompliance objects.
    */
  var ConformancePackRuleComplianceList: typings.awsSdk.configserviceMod.ConformancePackRuleComplianceList = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeConformancePackComplianceResponse {
  
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    ConformancePackRuleComplianceList: ConformancePackRuleComplianceList
  ): DescribeConformancePackComplianceResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackRuleComplianceList = ConformancePackRuleComplianceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceResponse]
  }
  
  @scala.inline
  implicit class DescribeConformancePackComplianceResponseOps[Self <: DescribeConformancePackComplianceResponse] (val x: Self) extends AnyVal {
    
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
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackRuleComplianceListVarargs(value: ConformancePackRuleCompliance*): Self = this.set("ConformancePackRuleComplianceList", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackRuleComplianceList(value: ConformancePackRuleComplianceList): Self = this.set("ConformancePackRuleComplianceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
