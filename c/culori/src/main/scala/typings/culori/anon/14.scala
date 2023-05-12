package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  def h(colorA: HNumber, colorB: HNumber): Double
  @JSName("h")
  var h_Original: js.Function2[/* colorA */ HNumber, /* colorB */ HNumber, Double]
}
object `14` {
  
  inline def apply(h: (/* colorA */ HNumber, /* colorB */ HNumber) => Double): `14` = {
    val __obj = js.Dynamic.literal(h = js.Any.fromFunction2(h))
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setH(value: (/* colorA */ HNumber, /* colorB */ HNumber) => Double): Self = StObject.set(x, "h", js.Any.fromFunction2(value))
  }
}
