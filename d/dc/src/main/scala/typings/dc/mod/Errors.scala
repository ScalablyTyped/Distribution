package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  def BadArgumentException(): Unit
  
  def Exception(msg: String): Unit
  
  def InvalidStateException(): Unit
}
object Errors {
  
  inline def apply(BadArgumentException: () => Unit, Exception: String => Unit, InvalidStateException: () => Unit): Errors = {
    val __obj = js.Dynamic.literal(BadArgumentException = js.Any.fromFunction0(BadArgumentException), Exception = js.Any.fromFunction1(Exception), InvalidStateException = js.Any.fromFunction0(InvalidStateException))
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setBadArgumentException(value: () => Unit): Self = StObject.set(x, "BadArgumentException", js.Any.fromFunction0(value))
    
    inline def setException(value: String => Unit): Self = StObject.set(x, "Exception", js.Any.fromFunction1(value))
    
    inline def setInvalidStateException(value: () => Unit): Self = StObject.set(x, "InvalidStateException", js.Any.fromFunction0(value))
  }
}
