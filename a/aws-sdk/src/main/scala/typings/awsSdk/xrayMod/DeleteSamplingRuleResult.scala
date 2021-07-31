package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSamplingRuleResult extends StObject {
  
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.undefined
}
object DeleteSamplingRuleResult {
  
  @scala.inline
  def apply(): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
  
  @scala.inline
  implicit class DeleteSamplingRuleResultMutableBuilder[Self <: DeleteSamplingRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
