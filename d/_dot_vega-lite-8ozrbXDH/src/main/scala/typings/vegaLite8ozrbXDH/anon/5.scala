package typings.vegaLite8ozrbXDH.anon

import typings.vegaTypings.encodeMod.LinearGradient
import typings.vegaTypings.encodeMod.RadialGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var value: String | Double | Boolean | (js.Array[Double | String]) | LinearGradient | RadialGradient
}
object `5` {
  
  inline def apply(value: String | Double | Boolean | (js.Array[Double | String]) | LinearGradient | RadialGradient): `5` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setValue(value: String | Double | Boolean | (js.Array[Double | String]) | LinearGradient | RadialGradient): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
