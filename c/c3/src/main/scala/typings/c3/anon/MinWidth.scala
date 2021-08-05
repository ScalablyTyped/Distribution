package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinWidth extends StObject {
  
  /**
    * Defaults to `5`.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
}
object MinWidth {
  
  inline def apply(): MinWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinWidth]
  }
  
  extension [Self <: MinWidth](x: Self) {
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
