package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipReadOnlyModeCheck extends StObject {
  
  var skipReadOnlyModeCheck: js.UndefOr[Boolean] = js.undefined
}
object SkipReadOnlyModeCheck {
  
  inline def apply(): SkipReadOnlyModeCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipReadOnlyModeCheck]
  }
  
  extension [Self <: SkipReadOnlyModeCheck](x: Self) {
    
    inline def setSkipReadOnlyModeCheck(value: Boolean): Self = StObject.set(x, "skipReadOnlyModeCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipReadOnlyModeCheckUndefined: Self = StObject.set(x, "skipReadOnlyModeCheck", js.undefined)
  }
}
