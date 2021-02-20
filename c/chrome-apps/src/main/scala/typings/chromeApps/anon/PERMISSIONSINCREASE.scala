package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.permissions_increase_
import typings.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PERMISSIONSINCREASE extends StObject {
  
  var PERMISSIONS_INCREASE: permissions_increase_ = js.native
  
  var UNKNOWN: unknown__ = js.native
}
object PERMISSIONSINCREASE {
  
  @scala.inline
  def apply(PERMISSIONS_INCREASE: permissions_increase_, UNKNOWN: unknown__): PERMISSIONSINCREASE = {
    val __obj = js.Dynamic.literal(PERMISSIONS_INCREASE = PERMISSIONS_INCREASE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PERMISSIONSINCREASE]
  }
  
  @scala.inline
  implicit class PERMISSIONSINCREASEMutableBuilder[Self <: PERMISSIONSINCREASE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPERMISSIONS_INCREASE(value: permissions_increase_): Self = StObject.set(x, "PERMISSIONS_INCREASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
