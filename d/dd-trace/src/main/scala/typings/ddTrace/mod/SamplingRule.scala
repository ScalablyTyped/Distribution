package typings.ddTrace.mod

import typings.std.Number
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRule extends js.Object {
  
  /**
    * Operation name on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String | RegExp] = js.native
  
  /**
    * Sampling rate for this rule.
    */
  var sampleRate: Number = js.native
  
  /**
    * Service on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String | RegExp] = js.native
}
object SamplingRule {
  
  @scala.inline
  def apply(sampleRate: Number): SamplingRule = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
  
  @scala.inline
  implicit class SamplingRuleOps[Self <: SamplingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSampleRate(value: Number): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String | RegExp): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setService(value: String | RegExp): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
