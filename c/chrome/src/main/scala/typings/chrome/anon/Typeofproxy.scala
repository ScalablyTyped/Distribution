package typings.chrome.anon

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofproxy extends StObject {
  
  var onProxyError: ProxyErrorEvent = js.native
  
  var settings: ChromeSetting = js.native
}
object Typeofproxy {
  
  @scala.inline
  def apply(onProxyError: ProxyErrorEvent, settings: ChromeSetting): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
  
  @scala.inline
  implicit class TypeofproxyMutableBuilder[Self <: Typeofproxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnProxyError(value: ProxyErrorEvent): Self = StObject.set(x, "onProxyError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ChromeSetting): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
