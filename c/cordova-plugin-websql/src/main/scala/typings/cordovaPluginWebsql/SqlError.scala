package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlError extends StObject {
  
  var code: Double
  
  var message: String
}
object SqlError {
  
  @scala.inline
  def apply(code: Double, message: String): SqlError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlError]
  }
  
  @scala.inline
  implicit class SqlErrorMutableBuilder[Self <: SqlError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
