package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var selected: Double | js.Array[Double]
}
object `0` {
  
  inline def apply(selected: Double | js.Array[Double]): `0` = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
