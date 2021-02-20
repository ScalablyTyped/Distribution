package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigRuleRequest extends StObject {
  
  /**
    * The name of the AWS Config rule that you want to delete.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
}
object DeleteConfigRuleRequest {
  
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigRuleRequestMutableBuilder[Self <: DeleteConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
  }
}
