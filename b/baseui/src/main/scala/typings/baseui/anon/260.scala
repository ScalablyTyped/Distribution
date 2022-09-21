package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `260`[Theme] extends StObject {
  
  @JSName("$theme")
  var $theme: Theme
}
object `260` {
  
  inline def apply[Theme]($theme: Theme): `260`[Theme] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[`260`[Theme]]
  }
  
  extension [Self <: `260`[?], Theme](x: Self & `260`[Theme]) {
    
    inline def set$theme(value: Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
