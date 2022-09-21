package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments of a signature help request.
  */
trait SignatureHelpRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Reason why signature help was invoked.
    * See each individual possible
    */
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.undefined
}
object SignatureHelpRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double): SignatureHelpRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpRequestArgs]
  }
  
  extension [Self <: SignatureHelpRequestArgs](x: Self) {
    
    inline def setTriggerReason(value: SignatureHelpTriggerReason): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    inline def setTriggerReasonUndefined: Self = StObject.set(x, "triggerReason", js.undefined)
  }
}
