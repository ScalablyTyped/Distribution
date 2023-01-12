package typings.chromeApps.WebView

import typings.chromeApps.HTMLWebViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewWindow extends StObject {
  
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit
  
  /**
    * Cancel the new window request.
    */
  def discard(): Unit
}
object NewWindow {
  
  inline def apply(attach: HTMLWebViewElement => Unit, discard: () => Unit): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), discard = js.Any.fromFunction0(discard))
    __obj.asInstanceOf[NewWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewWindow] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: HTMLWebViewElement => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setDiscard(value: () => Unit): Self = StObject.set(x, "discard", js.Any.fromFunction0(value))
  }
}
