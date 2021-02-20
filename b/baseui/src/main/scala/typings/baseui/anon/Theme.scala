package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme[T] extends StObject {
  
  @JSName("$theme")
  var $theme: T = js.native
}
object Theme {
  
  @scala.inline
  def apply[T]($theme: T): Theme[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[T]]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme[_], T] (val x: Self with Theme[T]) extends AnyVal {
    
    @scala.inline
    def set$theme(value: T): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
