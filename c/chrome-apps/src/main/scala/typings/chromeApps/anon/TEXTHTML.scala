package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TEXTHTML extends StObject {
  
  var TEXT_HTML: textHtml = js.native
  
  var TEXT_PLAIN: textPlain = js.native
}
object TEXTHTML {
  
  @scala.inline
  def apply(TEXT_HTML: textHtml, TEXT_PLAIN: textPlain): TEXTHTML = {
    val __obj = js.Dynamic.literal(TEXT_HTML = TEXT_HTML.asInstanceOf[js.Any], TEXT_PLAIN = TEXT_PLAIN.asInstanceOf[js.Any])
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
