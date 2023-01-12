package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.tls1
import typings.chromeApps.chromeAppsStrings.tls1Dot1
import typings.chromeApps.chromeAppsStrings.tls1Dot2
import typings.chromeApps.chromeAppsStrings.tls1Dot3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.undefined
  
  var min: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.undefined
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
