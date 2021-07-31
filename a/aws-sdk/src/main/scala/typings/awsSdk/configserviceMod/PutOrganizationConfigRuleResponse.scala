package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOrganizationConfigRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an organization config rule.
    */
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object PutOrganizationConfigRuleResponse {
  
  @scala.inline
  def apply(): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
  
  @scala.inline
  implicit class PutOrganizationConfigRuleResponseMutableBuilder[Self <: PutOrganizationConfigRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleArnUndefined: Self = StObject.set(x, "OrganizationConfigRuleArn", js.undefined)
  }
}
