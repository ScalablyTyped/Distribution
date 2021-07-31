package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigRuleStatusesRequest extends StObject {
  
  /**
    * The maximum number of OrganizationConfigRuleStatuses returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The names of organization config rules for which you want status details. If you do not specify any names, AWS Config returns details for all your organization AWS Confg rules.
    */
  var OrganizationConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleNames] = js.undefined
}
object DescribeOrganizationConfigRuleStatusesRequest {
  
  @scala.inline
  def apply(): DescribeOrganizationConfigRuleStatusesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigRuleStatusesRequestMutableBuilder[Self <: DescribeOrganizationConfigRuleStatusesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: CosmosPageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleNames(value: OrganizationConfigRuleNames): Self = StObject.set(x, "OrganizationConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleNamesUndefined: Self = StObject.set(x, "OrganizationConfigRuleNames", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "OrganizationConfigRuleNames", js.Array(value :_*))
  }
}
