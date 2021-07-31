package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chromestyle extends StObject {
  
  var chrome_style: js.UndefOr[Boolean] = js.undefined
  
  var open_in_tab: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
}
object Chromestyle {
  
  @scala.inline
  def apply(): Chromestyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chromestyle]
  }
  
  @scala.inline
  implicit class ChromestyleMutableBuilder[Self <: Chromestyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChrome_style(value: Boolean): Self = StObject.set(x, "chrome_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_styleUndefined: Self = StObject.set(x, "chrome_style", js.undefined)
    
    @scala.inline
    def setOpen_in_tab(value: Boolean): Self = StObject.set(x, "open_in_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_in_tabUndefined: Self = StObject.set(x, "open_in_tab", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
