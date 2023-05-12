package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.can_not_fix
import typings.cyclonedx.cyclonedxStrings.exploitable
import typings.cyclonedx.cyclonedxStrings.false_positive
import typings.cyclonedx.cyclonedxStrings.in_triage
import typings.cyclonedx.cyclonedxStrings.not_affected
import typings.cyclonedx.cyclonedxStrings.resolved
import typings.cyclonedx.cyclonedxStrings.resolved_with_pedigree
import typings.cyclonedx.cyclonedxStrings.rollback
import typings.cyclonedx.cyclonedxStrings.update
import typings.cyclonedx.cyclonedxStrings.will_not_fix
import typings.cyclonedx.cyclonedxStrings.workaround_available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  var detail: js.UndefOr[String] = js.undefined
  
  var justification: js.UndefOr[typings.cyclonedx.mod.Justification] = js.undefined
  
  var response: js.UndefOr[js.Array[can_not_fix | will_not_fix | update | rollback | workaround_available]] = js.undefined
  
  var state: js.UndefOr[
    resolved | resolved_with_pedigree | exploitable | in_triage | false_positive | not_affected
  ] = js.undefined
}
object Detail {
  
  inline def apply(): Detail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detail] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setJustification(value: typings.cyclonedx.mod.Justification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setResponse(value: js.Array[can_not_fix | will_not_fix | update | rollback | workaround_available]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponseVarargs(value: (can_not_fix | will_not_fix | update | rollback | workaround_available)*): Self = StObject.set(x, "response", js.Array(value*))
    
    inline def setState(value: resolved | resolved_with_pedigree | exploitable | in_triage | false_positive | not_affected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
