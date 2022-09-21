package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: typings.baseui.localeTypesMod.Locale
  
  var theme: typings.baseui.stylesTypesMod.Theme
}
object Locale {
  
  inline def apply(locale: typings.baseui.localeTypesMod.Locale, theme: typings.baseui.stylesTypesMod.Theme): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: typings.baseui.localeTypesMod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
