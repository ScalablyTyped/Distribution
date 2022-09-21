package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenOrientationEventMap extends StObject {
  
  var change: Event
}
object ScreenOrientationEventMap {
  
  inline def apply(change: Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
  
  extension [Self <: ScreenOrientationEventMap](x: Self) {
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
