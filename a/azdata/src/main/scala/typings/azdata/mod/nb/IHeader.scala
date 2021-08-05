package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHeader extends StObject {
  
  var msg_id: String
  
  var msg_type: String
  
  var session: String
  
  var username: String
  
  var version: String
}
object IHeader {
  
  inline def apply(msg_id: String, msg_type: String, session: String, username: String, version: String): IHeader = {
    val __obj = js.Dynamic.literal(msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
  
  extension [Self <: IHeader](x: Self) {
    
    inline def setMsg_id(value: String): Self = StObject.set(x, "msg_id", value.asInstanceOf[js.Any])
    
    inline def setMsg_type(value: String): Self = StObject.set(x, "msg_type", value.asInstanceOf[js.Any])
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
