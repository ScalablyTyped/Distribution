package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.permissions_increase_
import typings.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PERMISSIONSINCREASE extends StObject {
  
  var PERMISSIONS_INCREASE: permissions_increase_
  
  var UNKNOWN: unknown__
}
object PERMISSIONSINCREASE {
  
  inline def apply(): PERMISSIONSINCREASE = {
    val __obj = js.Dynamic.literal(PERMISSIONS_INCREASE = "permissions_increase", UNKNOWN = "unknown")
    __obj.asInstanceOf[PERMISSIONSINCREASE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PERMISSIONSINCREASE] (val x: Self) extends AnyVal {
    
    inline def setPERMISSIONS_INCREASE(value: permissions_increase_): Self = StObject.set(x, "PERMISSIONS_INCREASE", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
