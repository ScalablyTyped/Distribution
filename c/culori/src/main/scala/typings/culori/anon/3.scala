package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def h(`val`: js.Array[Double]): Double
  @JSName("h")
  var h_Original: js.Function1[/* val */ js.Array[Double], Double]
}
object `3` {
  
  inline def apply(h: /* val */ js.Array[Double] => Double): `3` = {
    val __obj = js.Dynamic.literal(h = js.Any.fromFunction1(h))
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setH(value: /* val */ js.Array[Double] => Double): Self = StObject.set(x, "h", js.Any.fromFunction1(value))
  }
}
