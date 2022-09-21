package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLevel extends StObject {
  
  var accessLevel: typings.chrome.chrome.storage.AccessLevel
}
object AccessLevel {
  
  inline def apply(accessLevel: typings.chrome.chrome.storage.AccessLevel): AccessLevel = {
    val __obj = js.Dynamic.literal(accessLevel = accessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLevel]
  }
  
  extension [Self <: AccessLevel](x: Self) {
    
    inline def setAccessLevel(value: typings.chrome.chrome.storage.AccessLevel): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
  }
}
