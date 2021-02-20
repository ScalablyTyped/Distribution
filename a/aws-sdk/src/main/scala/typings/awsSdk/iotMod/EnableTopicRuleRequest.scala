package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableTopicRuleRequest extends StObject {
  
  /**
    * The name of the topic rule to enable.
    */
  var ruleName: RuleName = js.native
}
object EnableTopicRuleRequest {
  
  @scala.inline
  def apply(ruleName: RuleName): EnableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableTopicRuleRequest]
  }
  
  @scala.inline
  implicit class EnableTopicRuleRequestMutableBuilder[Self <: EnableTopicRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
