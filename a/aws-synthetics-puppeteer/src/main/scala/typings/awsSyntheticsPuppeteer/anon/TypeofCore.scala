package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCore extends StObject {
  
  def HTTP_DATA(): Unit
  
  def SEND(): Unit
  
  def VALIDATE_CREDENTIALS(): Unit
  
  def VALIDATE_PARAMETERS(): Unit
  
  def VALIDATE_REGION(): Unit
  
  def removeListener(eventName: String, eventListener: js.Function): Unit
}
object TypeofCore {
  
  inline def apply(
    HTTP_DATA: () => Unit,
    SEND: () => Unit,
    VALIDATE_CREDENTIALS: () => Unit,
    VALIDATE_PARAMETERS: () => Unit,
    VALIDATE_REGION: () => Unit,
    removeListener: (String, js.Function) => Unit
  ): TypeofCore = {
    val __obj = js.Dynamic.literal(HTTP_DATA = js.Any.fromFunction0(HTTP_DATA), SEND = js.Any.fromFunction0(SEND), VALIDATE_CREDENTIALS = js.Any.fromFunction0(VALIDATE_CREDENTIALS), VALIDATE_PARAMETERS = js.Any.fromFunction0(VALIDATE_PARAMETERS), VALIDATE_REGION = js.Any.fromFunction0(VALIDATE_REGION), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[TypeofCore]
  }
  
  extension [Self <: TypeofCore](x: Self) {
    
    inline def setHTTP_DATA(value: () => Unit): Self = StObject.set(x, "HTTP_DATA", js.Any.fromFunction0(value))
    
    inline def setRemoveListener(value: (String, js.Function) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setSEND(value: () => Unit): Self = StObject.set(x, "SEND", js.Any.fromFunction0(value))
    
    inline def setVALIDATE_CREDENTIALS(value: () => Unit): Self = StObject.set(x, "VALIDATE_CREDENTIALS", js.Any.fromFunction0(value))
    
    inline def setVALIDATE_PARAMETERS(value: () => Unit): Self = StObject.set(x, "VALIDATE_PARAMETERS", js.Any.fromFunction0(value))
    
    inline def setVALIDATE_REGION(value: () => Unit): Self = StObject.set(x, "VALIDATE_REGION", js.Any.fromFunction0(value))
  }
}
