package typings.cyclonedx.anon

import typings.cyclonedx.mod.MimeText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var text: MimeText
}
object Locale {
  
  inline def apply(text: MimeText): Locale = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setText(value: MimeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
