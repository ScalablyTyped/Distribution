package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cc extends StObject {
  
  var cc: String
  
  var id: String
  
  var message: String
}
object Cc {
  
  inline def apply(cc: String, id: String, message: String): Cc = {
    val __obj = js.Dynamic.literal(cc = cc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cc]
  }
  
  extension [Self <: Cc](x: Self) {
    
    inline def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
