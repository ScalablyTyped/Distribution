package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSamplingRuleRequest extends StObject {
  
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: typings.awsSdk.clientsXrayMod.SamplingRuleUpdate
}
object UpdateSamplingRuleRequest {
  
  inline def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
  
  extension [Self <: UpdateSamplingRuleRequest](x: Self) {
    
    inline def setSamplingRuleUpdate(value: SamplingRuleUpdate): Self = StObject.set(x, "SamplingRuleUpdate", value.asInstanceOf[js.Any])
  }
}
