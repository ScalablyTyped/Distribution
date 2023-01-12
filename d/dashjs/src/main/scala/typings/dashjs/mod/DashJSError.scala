package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashJSError extends StObject {
  
  var code: Double | Null
  
  var data: Any | Null
  
  var message: String | Null
}
object DashJSError {
  
  inline def apply(): DashJSError = {
    val __obj = js.Dynamic.literal(code = null, data = null, message = null)
    __obj.asInstanceOf[DashJSError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashJSError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
  }
}
