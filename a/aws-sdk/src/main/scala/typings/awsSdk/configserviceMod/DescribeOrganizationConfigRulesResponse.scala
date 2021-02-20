package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigRulesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of OrganizationConfigRule objects.
    */
  var OrganizationConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRules] = js.native
}
object DescribeOrganizationConfigRulesResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigRulesResponseMutableBuilder[Self <: DescribeOrganizationConfigRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRules(value: OrganizationConfigRules): Self = StObject.set(x, "OrganizationConfigRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRulesUndefined: Self = StObject.set(x, "OrganizationConfigRules", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRulesVarargs(value: OrganizationConfigRule*): Self = StObject.set(x, "OrganizationConfigRules", js.Array(value :_*))
  }
}
