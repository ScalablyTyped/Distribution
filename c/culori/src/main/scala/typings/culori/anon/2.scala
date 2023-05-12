package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def h(colorA: S, colorB: S): Double
  @JSName("h")
  var h_Original: js.Function2[/* colorA */ S, /* colorB */ S, Double]
}
object `2` {
  
  inline def apply(h: (/* colorA */ S, /* colorB */ S) => Double): `2` = {
    val __obj = js.Dynamic.literal(h = js.Any.fromFunction2(h))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setH(value: (/* colorA */ S, /* colorB */ S) => Double): Self = StObject.set(x, "h", js.Any.fromFunction2(value))
  }
}
