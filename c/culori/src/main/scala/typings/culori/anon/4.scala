package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def h(colorA: CH, colorB: CH): Double
  @JSName("h")
  var h_Original: js.Function2[/* colorA */ CH, /* colorB */ CH, Double]
}
object `4` {
  
  inline def apply(h: (/* colorA */ CH, /* colorB */ CH) => Double): `4` = {
    val __obj = js.Dynamic.literal(h = js.Any.fromFunction2(h))
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setH(value: (/* colorA */ CH, /* colorB */ CH) => Double): Self = StObject.set(x, "h", js.Any.fromFunction2(value))
  }
}
