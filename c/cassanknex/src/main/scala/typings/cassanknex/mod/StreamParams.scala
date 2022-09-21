package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamParams extends StObject {
  
  def end(): Any
  
  def error(err: js.Error): Any
  
  def readable(): Any
}
object StreamParams {
  
  inline def apply(end: () => Any, error: js.Error => Any, readable: () => Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[StreamParams]
  }
  
  extension [Self <: StreamParams](x: Self) {
    
    inline def setEnd(value: () => Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setError(value: js.Error => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setReadable(value: () => Any): Self = StObject.set(x, "readable", js.Any.fromFunction0(value))
  }
}
