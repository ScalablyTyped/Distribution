package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PBC extends StObject {
  
  var PBC: typings.chromeApps.chromeAppsStrings.PBC
  
  var PIN: typings.chromeApps.chromeAppsStrings.PIN
}
object PBC {
  
  inline def apply(): PBC = {
    val __obj = js.Dynamic.literal(PBC = "PBC", PIN = "PIN")
    __obj.asInstanceOf[PBC]
  }
  
  extension [Self <: PBC](x: Self) {
    
    inline def setPBC(value: typings.chromeApps.chromeAppsStrings.PBC): Self = StObject.set(x, "PBC", value.asInstanceOf[js.Any])
    
    inline def setPIN(value: typings.chromeApps.chromeAppsStrings.PIN): Self = StObject.set(x, "PIN", value.asInstanceOf[js.Any])
  }
}
