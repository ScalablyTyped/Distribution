package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TEXTHTML extends StObject {
  
  var TEXT_HTML: textHtml
  
  var TEXT_PLAIN: textPlain
}
object TEXTHTML {
  
  @scala.inline
  def apply(): TEXTHTML = {
    val __obj = js.Dynamic.literal(TEXT_HTML = "textHtml", TEXT_PLAIN = "textPlain")
    __obj.asInstanceOf[TEXTHTML]
  }
  
  @scala.inline
  implicit class TEXTHTMLMutableBuilder[Self <: TEXTHTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTEXT_HTML(value: textHtml): Self = StObject.set(x, "TEXT_HTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_PLAIN(value: textPlain): Self = StObject.set(x, "TEXT_PLAIN", value.asInstanceOf[js.Any])
  }
}
