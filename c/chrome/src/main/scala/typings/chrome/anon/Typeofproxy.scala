package typings.chrome.anon

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofproxy extends StObject {
  
  var onProxyError: ProxyErrorEvent
  
  var settings: ChromeSetting
}
object Typeofproxy {
  
  inline def apply(onProxyError: ProxyErrorEvent, settings: ChromeSetting): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
  
  extension [Self <: Typeofproxy](x: Self) {
    
    inline def setOnProxyError(value: ProxyErrorEvent): Self = StObject.set(x, "onProxyError", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ChromeSetting): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
