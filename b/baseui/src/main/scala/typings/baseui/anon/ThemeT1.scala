package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeT1[T1] extends StObject {
  
  @JSName("$theme")
  var $theme: T1 = js.native
}
object ThemeT1 {
  
  @scala.inline
  def apply[T1]($theme: T1): ThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT1[T1]]
  }
  
  @scala.inline
  implicit class ThemeT1MutableBuilder[Self <: ThemeT1[_], T1] (val x: Self with ThemeT1[T1]) extends AnyVal {
    
    @scala.inline
    def set$theme(value: T1): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
