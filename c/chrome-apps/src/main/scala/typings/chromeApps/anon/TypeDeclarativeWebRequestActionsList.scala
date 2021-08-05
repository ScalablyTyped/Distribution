package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestActionsList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDeclarativeWebRequestActionsList extends StObject {
  
  /** Action type */
  var `type`: DeclarativeWebRequestActionsList
}
object TypeDeclarativeWebRequestActionsList {
  
  inline def apply(`type`: DeclarativeWebRequestActionsList): TypeDeclarativeWebRequestActionsList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDeclarativeWebRequestActionsList]
  }
  
  extension [Self <: TypeDeclarativeWebRequestActionsList](x: Self) {
    
    inline def setType(value: DeclarativeWebRequestActionsList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
