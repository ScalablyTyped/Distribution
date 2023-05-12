package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderNameValuePair extends StObject {
  
  /** Name of the HTTP header. */
  var name: String
  
  /** Value of the HTTP header. */
  var value: String
}
object HeaderNameValuePair {
  
  inline def apply(name: String, value: String): HeaderNameValuePair = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderNameValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderNameValuePair] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
