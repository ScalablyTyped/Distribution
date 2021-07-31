package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCookie extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object RequestCookie {
  
  @scala.inline
  def apply(): RequestCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCookie]
  }
  
  @scala.inline
  implicit class RequestCookieMutableBuilder[Self <: RequestCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
