package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmallTheme extends StObject {
  
  var small: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[`9`] = js.native
}
object SmallTheme {
  
  @scala.inline
  def apply(): SmallTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmallTheme]
  }
  
  @scala.inline
  implicit class SmallThemeMutableBuilder[Self <: SmallTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setTheme(value: `9`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
