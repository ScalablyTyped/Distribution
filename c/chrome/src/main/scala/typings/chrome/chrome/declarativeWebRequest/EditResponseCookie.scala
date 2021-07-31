package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditResponseCookie extends StObject {
  
  var filter: ResponseCookie
  
  var modification: ResponseCookie
}
object EditResponseCookie {
  
  @scala.inline
  def apply(filter: ResponseCookie, modification: ResponseCookie): EditResponseCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditResponseCookie]
  }
  
  @scala.inline
  implicit class EditResponseCookieMutableBuilder[Self <: EditResponseCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: ResponseCookie): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification(value: ResponseCookie): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
  }
}
