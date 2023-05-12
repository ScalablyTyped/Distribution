package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePreview extends StObject {
  
  var enable: Boolean
  
  var host: String
  
  var management_token: String
}
object LivePreview {
  
  inline def apply(enable: Boolean, host: String, management_token: String): LivePreview = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], management_token = management_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LivePreview] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setManagement_token(value: String): Self = StObject.set(x, "management_token", value.asInstanceOf[js.Any])
  }
}
