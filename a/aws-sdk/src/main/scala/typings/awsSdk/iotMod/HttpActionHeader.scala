package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpActionHeader extends StObject {
  
  /**
    * The HTTP header key.
    */
  var key: HeaderKey
  
  /**
    * The HTTP header value. Substitution templates are supported.
    */
  var value: HeaderValue
}
object HttpActionHeader {
  
  @scala.inline
  def apply(key: HeaderKey, value: HeaderValue): HttpActionHeader = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpActionHeader]
  }
  
  @scala.inline
  implicit class HttpActionHeaderMutableBuilder[Self <: HttpActionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: HeaderKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: HeaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
