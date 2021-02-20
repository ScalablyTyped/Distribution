package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.fixed_
import typings.chromeApps.chromeAppsStrings.removable_
import typings.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIXED extends StObject {
  
  var FIXED: fixed_ = js.native
  
  var REMOVABLE: removable_ = js.native
  
  var UNKNOWN: unknown__ = js.native
}
object FIXED {
  
  @scala.inline
  def apply(FIXED: fixed_, REMOVABLE: removable_, UNKNOWN: unknown__): FIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], REMOVABLE = REMOVABLE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[FIXED]
  }
  
  @scala.inline
  implicit class FIXEDMutableBuilder[Self <: FIXED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFIXED(value: fixed_): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREMOVABLE(value: removable_): Self = StObject.set(x, "REMOVABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
