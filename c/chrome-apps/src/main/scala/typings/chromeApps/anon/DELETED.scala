package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETED extends StObject {
  
  var CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED
  
  var DELETED: typings.chromeApps.chromeAppsStrings.DELETED
}
object DELETED {
  
  inline def apply(): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = "CHANGED", DELETED = "DELETED")
    __obj.asInstanceOf[DELETED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETED] (val x: Self) extends AnyVal {
    
    inline def setCHANGED(value: typings.chromeApps.chromeAppsStrings.CHANGED): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    inline def setDELETED(value: typings.chromeApps.chromeAppsStrings.DELETED): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
  }
}
