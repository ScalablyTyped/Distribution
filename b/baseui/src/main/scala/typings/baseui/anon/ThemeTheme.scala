package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTheme extends StObject {
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object ThemeTheme {
  
  inline def apply($theme: typings.baseui.stylesTypesMod.Theme): ThemeTheme = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme]
  }
  
  extension [Self <: ThemeTheme](x: Self) {
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
