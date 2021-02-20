package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.added_
import typings.chromeApps.chromeAppsStrings.deleted_
import typings.chromeApps.chromeAppsStrings.updated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADDED extends StObject {
  
  var ADDED: added_ = js.native
  
  var DELETED: deleted_ = js.native
  
  var UPDATED: updated_ = js.native
}
object ADDED {
  
  @scala.inline
  def apply(ADDED: added_, DELETED: deleted_, UPDATED: updated_): ADDED = {
    val __obj = js.Dynamic.literal(ADDED = ADDED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any], UPDATED = UPDATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADDED]
  }
  
  @scala.inline
  implicit class ADDEDMutableBuilder[Self <: ADDED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADDED(value: added_): Self = StObject.set(x, "ADDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETED(value: deleted_): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATED(value: updated_): Self = StObject.set(x, "UPDATED", value.asInstanceOf[js.Any])
  }
}
