package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSamplingRuleResult extends StObject {
  
  /**
    * The updated rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}
object UpdateSamplingRuleResult {
  
  @scala.inline
  def apply(): UpdateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSamplingRuleResult]
  }
  
  @scala.inline
  implicit class UpdateSamplingRuleResultMutableBuilder[Self <: UpdateSamplingRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
