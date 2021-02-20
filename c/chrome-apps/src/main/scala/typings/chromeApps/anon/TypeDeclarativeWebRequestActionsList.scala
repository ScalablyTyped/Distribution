package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestActionsList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDeclarativeWebRequestActionsList extends StObject {
  
  /** Action type */
  var `type`: DeclarativeWebRequestActionsList = js.native
}
object TypeDeclarativeWebRequestActionsList {
  
  @scala.inline
  def apply(`type`: DeclarativeWebRequestActionsList): TypeDeclarativeWebRequestActionsList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDeclarativeWebRequestActionsList]
  }
  
  @scala.inline
  implicit class TypeDeclarativeWebRequestActionsListMutableBuilder[Self <: TypeDeclarativeWebRequestActionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclarativeWebRequestActionsList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
