package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.changed_
import typings.chromeApps.chromeAppsStrings.created
import typings.chromeApps.chromeAppsStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHANGED extends StObject {
  
  var CHANGED: changed_
  
  var CREATED: created
  
  var REMOVED: removed
}
object CHANGED {
  
  inline def apply(): CHANGED = {
    val __obj = js.Dynamic.literal(CHANGED = "changed", CREATED = "created", REMOVED = "removed")
    __obj.asInstanceOf[CHANGED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CHANGED] (val x: Self) extends AnyVal {
    
    inline def setCHANGED(value: changed_): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    inline def setCREATED(value: created): Self = StObject.set(x, "CREATED", value.asInstanceOf[js.Any])
    
    inline def setREMOVED(value: removed): Self = StObject.set(x, "REMOVED", value.asInstanceOf[js.Any])
  }
}
