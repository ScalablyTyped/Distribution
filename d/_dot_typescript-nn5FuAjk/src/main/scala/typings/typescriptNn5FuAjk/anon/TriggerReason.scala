package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RefactorTriggerReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerReason extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  var triggerReason: js.UndefOr[RefactorTriggerReason] = js.undefined
}
object TriggerReason {
  
  inline def apply(): TriggerReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerReason]
  }
  
  extension [Self <: TriggerReason](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTriggerReason(value: RefactorTriggerReason): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    inline def setTriggerReasonUndefined: Self = StObject.set(x, "triggerReason", js.undefined)
  }
}
