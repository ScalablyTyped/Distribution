package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensionpages extends StObject {
  
  var extension_pages: js.UndefOr[String] = js.undefined
  
  var sandbox: js.UndefOr[String] = js.undefined
}
object Extensionpages {
  
  inline def apply(): Extensionpages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensionpages]
  }
  
  extension [Self <: Extensionpages](x: Self) {
    
    inline def setExtension_pages(value: String): Self = StObject.set(x, "extension_pages", value.asInstanceOf[js.Any])
    
    inline def setExtension_pagesUndefined: Self = StObject.set(x, "extension_pages", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
  }
}
