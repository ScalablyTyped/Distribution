package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSamplingRuleResult extends js.Object {
  
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}
object DeleteSamplingRuleResult {
  
  @scala.inline
  def apply(): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
  
  @scala.inline
  implicit class DeleteSamplingRuleResultOps[Self <: DeleteSamplingRuleResult] (val x: Self) extends AnyVal {
    
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
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = this.set("SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRuleRecord: Self = this.set("SamplingRuleRecord", js.undefined)
  }
}
