package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeT[T] extends StObject {
  
  @JSName("$theme")
  var $theme: T = js.native
}
object ThemeT {
  
  @scala.inline
  def apply[T]($theme: T): ThemeT[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT[T]]
  }
  
  @scala.inline
  implicit class ThemeTMutableBuilder[Self <: ThemeT[_], T] (val x: Self with ThemeT[T]) extends AnyVal {
    
    @scala.inline
    def set$theme(value: T): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
