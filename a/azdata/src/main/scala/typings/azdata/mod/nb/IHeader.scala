package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHeader extends StObject {
  
  var msg_id: js.UndefOr[String] = js.undefined
  
  var msg_type: String
  
  var session: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object IHeader {
  
  inline def apply(msg_type: String): IHeader = {
    val __obj = js.Dynamic.literal(msg_type = msg_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHeader] (val x: Self) extends AnyVal {
    
    inline def setMsg_id(value: String): Self = StObject.set(x, "msg_id", value.asInstanceOf[js.Any])
    
    inline def setMsg_idUndefined: Self = StObject.set(x, "msg_id", js.undefined)
    
    inline def setMsg_type(value: String): Self = StObject.set(x, "msg_type", value.asInstanceOf[js.Any])
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
