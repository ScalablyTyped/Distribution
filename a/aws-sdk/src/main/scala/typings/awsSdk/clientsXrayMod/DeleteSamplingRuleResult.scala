package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSamplingRuleResult extends StObject {
  
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.clientsXrayMod.SamplingRuleRecord] = js.undefined
}
object DeleteSamplingRuleResult {
  
  inline def apply(): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
  
  extension [Self <: DeleteSamplingRuleResult](x: Self) {
    
    inline def setSamplingRuleRecord(value: SamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
    
    inline def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
  }
}
