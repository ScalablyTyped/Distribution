package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePackComplianceResponse extends StObject {
  
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
  implicit class DescribeConformancePackComplianceResponseMutableBuilder[Self <: DescribeConformancePackComplianceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackRuleComplianceList(value: ConformancePackRuleComplianceList): Self = StObject.set(x, "ConformancePackRuleComplianceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackRuleComplianceListVarargs(value: ConformancePackRuleCompliance*): Self = StObject.set(x, "ConformancePackRuleComplianceList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
