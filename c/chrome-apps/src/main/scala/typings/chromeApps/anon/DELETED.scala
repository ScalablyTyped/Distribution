package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DELETED extends StObject {
  
  var CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED = js.native
  
  var DELETED: typings.chromeApps.chromeAppsStrings.DELETED = js.native
}
object DELETED {
  
  @scala.inline
  def apply(
    CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED,
    DELETED: typings.chromeApps.chromeAppsStrings.DELETED
  ): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETED]
  }
  
  @scala.inline
  implicit class DELETEDMutableBuilder[Self <: DELETED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHANGED(value: typings.chromeApps.chromeAppsStrings.CHANGED): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETED(value: typings.chromeApps.chromeAppsStrings.DELETED): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
  }
}
