package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resp extends StObject {
  
  def error(msg: Any): scala.Nothing
  
  def success(msg: Any): scala.Nothing
}
object Resp {
  
  inline def apply(error: Any => scala.Nothing, success: Any => scala.Nothing): Resp = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Resp]
  }
  
  extension [Self <: Resp](x: Self) {
    
    inline def setError(value: Any => scala.Nothing): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: Any => scala.Nothing): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
