package typings.chromeApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElementTagNameMap extends StObject {
  
  var appview: HTMLAppViewElement = js.native
  
  var webview: HTMLWebViewElement = js.native
}
object HTMLElementTagNameMap {
  
  @scala.inline
  def apply(appview: HTMLAppViewElement, webview: HTMLWebViewElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(appview = appview.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  
  @scala.inline
  implicit class HTMLElementTagNameMapMutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppview(value: HTMLAppViewElement): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebview(value: HTMLWebViewElement): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
  }
}
