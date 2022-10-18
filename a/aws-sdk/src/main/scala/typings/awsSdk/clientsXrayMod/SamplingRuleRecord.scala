package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingRuleRecord extends StObject {
  
  /**
    * When the rule was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the rule was last modified.
    */
  var ModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The sampling rule.
    */
  var SamplingRule: js.UndefOr[typings.awsSdk.clientsXrayMod.SamplingRule] = js.undefined
}
object SamplingRuleRecord {
  
  inline def apply(): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleRecord]
  }
  
  extension [Self <: SamplingRuleRecord](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
    
    inline def setSamplingRule(value: SamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
    
    inline def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
  }
}
