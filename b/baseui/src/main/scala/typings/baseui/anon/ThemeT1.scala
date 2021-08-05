package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeT1[T1] extends StObject {
  
  @JSName("$theme")
  var $theme: T1
}
object ThemeT1 {
  
  inline def apply[T1]($theme: T1): ThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT1[T1]]
  }
  
  extension [Self <: ThemeT1[?], T1](x: Self & ThemeT1[T1]) {
    
    inline def set$theme(value: T1): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
