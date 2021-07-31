package typings.azdata.mod

import typings.vscode.mod.WebviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Contents of the webview.
    *
    * Should be a complete html document.
    */
  var html: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Content settings for the webview.
    */
  var options: js.UndefOr[WebviewOptions] = js.undefined
}
object WebViewProperties {
  
  @scala.inline
  def apply(): WebViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewProperties]
  }
  
  @scala.inline
  implicit class WebViewPropertiesMutableBuilder[Self <: WebViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOptions(value: WebviewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
