package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSamplingRuleRequest extends js.Object {
  
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
  implicit class UpdateSamplingRuleRequestOps[Self <: UpdateSamplingRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSamplingRuleUpdate(value: SamplingRuleUpdate): Self = this.set("SamplingRuleUpdate", value.asInstanceOf[js.Any])
  }
}
