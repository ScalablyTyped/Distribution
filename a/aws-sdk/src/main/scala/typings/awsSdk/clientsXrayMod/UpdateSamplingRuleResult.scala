package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSamplingRuleResult extends StObject {
  
  /**
    * The updated rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.clientsXrayMod.SamplingRuleRecord] = js.undefined
}
object UpdateSamplingRuleResult {
  
  inline def apply(): UpdateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSamplingRuleResult]
  }
  
  extension [Self <: UpdateSamplingRuleResult](x: Self) {
    
    inline def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    inline def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
