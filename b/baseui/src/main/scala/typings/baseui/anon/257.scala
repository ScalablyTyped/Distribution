package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `257`[Theme] extends StObject {
  
  @JSName("$theme")
  var $theme: Theme
}
object `257` {
  
  inline def apply[Theme]($theme: Theme): `257`[Theme] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[`257`[Theme]]
  }
  
  extension [Self <: `257`[?], Theme](x: Self & `257`[Theme]) {
    
    inline def set$theme(value: Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
