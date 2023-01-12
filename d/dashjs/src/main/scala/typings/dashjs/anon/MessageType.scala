package typings.dashjs.anon

import typings.dashjs.mod.SessionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageType extends StObject {
  
  var messageType: String
  
  var sessionToken: SessionToken
}
object MessageType {
  
  inline def apply(messageType: String, sessionToken: SessionToken): MessageType = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: SessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
  }
}
