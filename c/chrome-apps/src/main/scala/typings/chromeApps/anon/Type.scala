package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestActionsList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /** Action type */
  var `type`: DeclarativeWebRequestActionsList
}
object Type {
  
  inline def apply(`type`: DeclarativeWebRequestActionsList): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclarativeWebRequestActionsList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
