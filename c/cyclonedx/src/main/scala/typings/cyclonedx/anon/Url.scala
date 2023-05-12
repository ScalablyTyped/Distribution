package typings.cyclonedx.anon

import typings.cyclonedx.mod.MimeText
import typings.cyclonedx.mod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var text: js.UndefOr[MimeText] = js.undefined
  
  var url: js.UndefOr[URL] = js.undefined
}
object Url {
  
  inline def apply(): Url = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Url]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
    
    inline def setText(value: MimeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
