package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddResponseHeaderParams extends StObject {
  
  /** HTTP response header name */
  var name: String = js.native
  
  /** HTTP response header value */
  var value: String = js.native
}
object AddResponseHeaderParams {
  
  @scala.inline
  def apply(name: String, value: String): AddResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResponseHeaderParams]
  }
  
  @scala.inline
  implicit class AddResponseHeaderParamsMutableBuilder[Self <: AddResponseHeaderParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
