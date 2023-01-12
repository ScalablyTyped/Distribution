package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.added_
import typings.chromeApps.chromeAppsStrings.deleted_
import typings.chromeApps.chromeAppsStrings.updated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADDED extends StObject {
  
  var ADDED: added_
  
  var DELETED: deleted_
  
  var UPDATED: updated_
}
object ADDED {
  
  inline def apply(): ADDED = {
    val __obj = js.Dynamic.literal(ADDED = "added", DELETED = "deleted", UPDATED = "updated")
    __obj.asInstanceOf[ADDED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ADDED] (val x: Self) extends AnyVal {
    
    inline def setADDED(value: added_): Self = StObject.set(x, "ADDED", value.asInstanceOf[js.Any])
    
    inline def setDELETED(value: deleted_): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
    
    inline def setUPDATED(value: updated_): Self = StObject.set(x, "UPDATED", value.asInstanceOf[js.Any])
  }
}
