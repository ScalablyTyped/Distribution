package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableTopicRuleRequest extends StObject {
  
  /**
    * The name of the topic rule to enable.
    */
  var ruleName: RuleName
}
object EnableTopicRuleRequest {
  
  inline def apply(ruleName: RuleName): EnableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableTopicRuleRequest]
  }
  
  extension [Self <: EnableTopicRuleRequest](x: Self) {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
