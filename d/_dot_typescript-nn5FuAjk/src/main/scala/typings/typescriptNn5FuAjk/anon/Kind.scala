package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol.RefactorTriggerReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  var triggerReason: js.UndefOr[RefactorTriggerReason] = js.undefined
}
object Kind {
  
  inline def apply(): Kind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTriggerReason(value: RefactorTriggerReason): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    inline def setTriggerReasonUndefined: Self = StObject.set(x, "triggerReason", js.undefined)
  }
}
