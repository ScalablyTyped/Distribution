package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeT[T] extends StObject {
  
  @JSName("$theme")
  var $theme: T
}
object ThemeT {
  
  inline def apply[T]($theme: T): ThemeT[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT[T]]
  }
  
  extension [Self <: ThemeT[?], T](x: Self & ThemeT[T]) {
    
    inline def set$theme(value: T): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
