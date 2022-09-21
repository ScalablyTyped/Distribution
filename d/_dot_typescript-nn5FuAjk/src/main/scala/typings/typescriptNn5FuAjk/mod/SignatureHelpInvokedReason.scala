package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.invoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
trait SignatureHelpInvokedReason
  extends StObject
     with SignatureHelpTriggerReason {
  
  var kind: invoked
  
  var triggerCharacter: Unit
}
object SignatureHelpInvokedReason {
  
  inline def apply(triggerCharacter: Unit): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
  
  extension [Self <: SignatureHelpInvokedReason](x: Self) {
    
    inline def setKind(value: invoked): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacter(value: Unit): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
  }
}
