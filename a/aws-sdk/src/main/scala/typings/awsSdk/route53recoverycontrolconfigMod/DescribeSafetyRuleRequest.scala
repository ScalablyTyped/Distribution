package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSafetyRuleRequest extends StObject {
  
  /**
    * The ARN of the safety rule.
    */
  var SafetyRuleArn: string
}
object DescribeSafetyRuleRequest {
  
  inline def apply(SafetyRuleArn: string): DescribeSafetyRuleRequest = {
    val __obj = js.Dynamic.literal(SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSafetyRuleRequest]
  }
  
  extension [Self <: DescribeSafetyRuleRequest](x: Self) {
    
    inline def setSafetyRuleArn(value: string): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
  }
}
