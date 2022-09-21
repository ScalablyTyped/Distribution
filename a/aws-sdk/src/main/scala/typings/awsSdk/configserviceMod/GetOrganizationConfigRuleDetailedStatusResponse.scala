package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationConfigRuleDetailedStatusResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of MemberAccountStatus objects.
    */
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRuleDetailedStatus] = js.undefined
}
object GetOrganizationConfigRuleDetailedStatusResponse {
  
  inline def apply(): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
  
  extension [Self <: GetOrganizationConfigRuleDetailedStatusResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConfigRuleDetailedStatus(value: OrganizationConfigRuleDetailedStatus): Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleDetailedStatusUndefined: Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", js.undefined)
    
    inline def setOrganizationConfigRuleDetailedStatusVarargs(value: MemberAccountStatus*): Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", js.Array(value*))
  }
}
