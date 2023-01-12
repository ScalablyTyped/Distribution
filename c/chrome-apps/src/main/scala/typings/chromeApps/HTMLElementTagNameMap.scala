package typings.chromeApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElementTagNameMap extends StObject {
  
  var appview: HTMLAppViewElement
  
  var webview: HTMLWebViewElement
}
object HTMLElementTagNameMap {
  
  inline def apply(appview: HTMLAppViewElement, webview: HTMLWebViewElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(appview = appview.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
    
    inline def setAppview(value: HTMLAppViewElement): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
    
    inline def setWebview(value: HTMLWebViewElement): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
  }
}
