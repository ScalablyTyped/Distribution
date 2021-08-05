package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmallTheme extends StObject {
  
  var small: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[`9`] = js.undefined
}
object SmallTheme {
  
  inline def apply(): SmallTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmallTheme]
  }
  
  extension [Self <: SmallTheme](x: Self) {
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setTheme(value: `9`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
