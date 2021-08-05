package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[T] extends StObject {
  
  @JSName("$theme")
  var $theme: T
}
object Theme {
  
  inline def apply[T]($theme: T): Theme[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[T]]
  }
  
  extension [Self <: Theme[?], T](x: Self & Theme[T]) {
    
    inline def set$theme(value: T): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
