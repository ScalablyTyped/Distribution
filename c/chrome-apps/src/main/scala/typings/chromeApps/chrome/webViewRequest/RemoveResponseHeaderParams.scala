package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveResponseHeaderParams extends StObject {
  
  /** HTTP request header name (case-insensitive). */
  var name: String
  
  /** HTTP request header value (case-insensitive). */
  var value: js.UndefOr[String] = js.undefined
}
object RemoveResponseHeaderParams {
  
  @scala.inline
  def apply(name: String): RemoveResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResponseHeaderParams]
  }
  
  @scala.inline
  implicit class RemoveResponseHeaderParamsMutableBuilder[Self <: RemoveResponseHeaderParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
