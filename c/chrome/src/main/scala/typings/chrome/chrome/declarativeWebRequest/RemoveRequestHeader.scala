package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveRequestHeader extends StObject {
  
  var name: String = js.native
}
object RemoveRequestHeader {
  
  @scala.inline
  def apply(name: String): RemoveRequestHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestHeader]
  }
  
  @scala.inline
  implicit class RemoveRequestHeaderMutableBuilder[Self <: RemoveRequestHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
