package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrganizationConfigRuleRequest extends StObject {
  
  /**
    * The name of organization config rule that you want to delete.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
}
object DeleteOrganizationConfigRuleRequest {
  
  @scala.inline
  def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): DeleteOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteOrganizationConfigRuleRequestMutableBuilder[Self <: DeleteOrganizationConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
  }
}
