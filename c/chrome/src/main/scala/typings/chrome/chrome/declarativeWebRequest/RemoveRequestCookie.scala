package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRequestCookie extends StObject {
  
  var filter: RequestCookie
}
object RemoveRequestCookie {
  
  @scala.inline
  def apply(filter: RequestCookie): RemoveRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestCookie]
  }
  
  @scala.inline
  implicit class RemoveRequestCookieMutableBuilder[Self <: RemoveRequestCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: RequestCookie): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
