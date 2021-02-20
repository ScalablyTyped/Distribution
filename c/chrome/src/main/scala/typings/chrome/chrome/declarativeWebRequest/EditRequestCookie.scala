package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRequestCookie extends StObject {
  
  var filter: RequestCookie = js.native
  
  var modification: RequestCookie = js.native
}
object EditRequestCookie {
  
  @scala.inline
  def apply(filter: RequestCookie, modification: RequestCookie): EditRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRequestCookie]
  }
  
  @scala.inline
  implicit class EditRequestCookieMutableBuilder[Self <: EditRequestCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: RequestCookie): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification(value: RequestCookie): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
  }
}
