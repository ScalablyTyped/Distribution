package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.changed_
import typings.chromeApps.chromeAppsStrings.created
import typings.chromeApps.chromeAppsStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHANGED extends StObject {
  
  var CHANGED: changed_ = js.native
  
  var CREATED: created = js.native
  
  var REMOVED: removed = js.native
}
object CHANGED {
  
  @scala.inline
  def apply(CHANGED: changed_, CREATED: created, REMOVED: removed): CHANGED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], CREATED = CREATED.asInstanceOf[js.Any], REMOVED = REMOVED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHANGED]
  }
  
  @scala.inline
  implicit class CHANGEDMutableBuilder[Self <: CHANGED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHANGED(value: changed_): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATED(value: created): Self = StObject.set(x, "CREATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREMOVED(value: removed): Self = StObject.set(x, "REMOVED", value.asInstanceOf[js.Any])
  }
}
