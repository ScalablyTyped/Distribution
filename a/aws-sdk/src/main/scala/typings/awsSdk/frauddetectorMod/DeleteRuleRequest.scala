package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleRequest extends StObject {
  
  var rule: Rule
}
object DeleteRuleRequest {
  
  @scala.inline
  def apply(rule: Rule): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteRuleRequestMutableBuilder[Self <: DeleteRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
