package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonCodeSummary extends StObject {
  
  /**
    * The name of the finding reason code.
    */
  var name: js.UndefOr[FindingReasonCode] = js.undefined
  
  /**
    * The value of the finding reason code summary.
    */
  var value: js.UndefOr[SummaryValue] = js.undefined
}
object ReasonCodeSummary {
  
  inline def apply(): ReasonCodeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReasonCodeSummary]
  }
  
  extension [Self <: ReasonCodeSummary](x: Self) {
    
    inline def setName(value: FindingReasonCode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: SummaryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
