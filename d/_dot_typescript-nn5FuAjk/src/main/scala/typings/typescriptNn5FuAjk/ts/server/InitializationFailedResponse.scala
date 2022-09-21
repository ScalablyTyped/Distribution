package typings.typescriptNn5FuAjk.ts.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationFailedResponse
  extends StObject
     with TypingInstallerResponse {
  
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed
  
  val message: String
  
  val stack: js.UndefOr[String] = js.undefined
}
object InitializationFailedResponse {
  
  inline def apply(kind: EventInitializationFailed, message: String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationFailedResponse]
  }
  
  extension [Self <: InitializationFailedResponse](x: Self) {
    
    inline def setKind(value: EventInitializationFailed): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
