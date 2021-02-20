package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSamplingRuleRequest extends StObject {
  
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: typings.awsSdk.xrayMod.SamplingRuleUpdate = js.native
}
object UpdateSamplingRuleRequest {
  
  @scala.inline
  def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateSamplingRuleRequestMutableBuilder[Self <: UpdateSamplingRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRuleUpdate(value: SamplingRuleUpdate): Self = StObject.set(x, "SamplingRuleUpdate", value.asInstanceOf[js.Any])
  }
}
