package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resp extends StObject {
  
  def error(msg: js.Any): scala.Nothing
  
  def success(msg: js.Any): scala.Nothing
}
object Resp {
  
  @scala.inline
  def apply(error: js.Any => scala.Nothing, success: js.Any => scala.Nothing): Resp = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Resp]
  }
  
  @scala.inline
  implicit class RespMutableBuilder[Self <: Resp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any => scala.Nothing): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: js.Any => scala.Nothing): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
