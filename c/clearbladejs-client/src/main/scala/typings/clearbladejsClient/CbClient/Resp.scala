package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resp extends StObject {
  
  def error(msg: js.Any): scala.Nothing
  
  // todo: figure out if we can have the compiler throw an error if someone adds code after this
  def success(msg: js.Any): scala.Nothing
}
object Resp {
  
  inline def apply(error: js.Any => scala.Nothing, success: js.Any => scala.Nothing): Resp = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Resp]
  }
  
  extension [Self <: Resp](x: Self) {
    
    inline def setError(value: js.Any => scala.Nothing): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: js.Any => scala.Nothing): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
