package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRequestCookie extends StObject {
  
  var filter: RequestCookie
  
  var modification: RequestCookie
}
object EditRequestCookie {
  
  inline def apply(filter: RequestCookie, modification: RequestCookie): EditRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRequestCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditRequestCookie] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: RequestCookie): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setModification(value: RequestCookie): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
  }
}
