package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.default
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.minimal
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.purple
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizationParameters extends StObject {
  
  var buttonCaption: js.UndefOr[String] = js.undefined
  
  var buttonClass: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[CustomizedStyles] = js.undefined
  
  var text: js.UndefOr[CustomizedText] = js.undefined
  
  var theme: js.UndefOr[default | white | minimal | purple] = js.undefined
}
object CustomizationParameters {
  
  inline def apply(): CustomizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomizationParameters] (val x: Self) extends AnyVal {
    
    inline def setButtonCaption(value: String): Self = StObject.set(x, "buttonCaption", value.asInstanceOf[js.Any])
    
    inline def setButtonCaptionUndefined: Self = StObject.set(x, "buttonCaption", js.undefined)
    
    inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
    
    inline def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
    
    inline def setStyles(value: CustomizedStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setText(value: CustomizedText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: default | white | minimal | purple): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
