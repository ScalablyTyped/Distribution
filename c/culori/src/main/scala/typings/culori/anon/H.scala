package typings.culori.anon

import typings.culori.culoriDoubles.`4.614`
import typings.culori.culoriInts.`360`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H extends StObject {
  
  var h: js.Tuple2[typings.culori.culoriInts.`0`, `360`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`]
  
  var s: js.Tuple2[typings.culori.culoriInts.`0`, `4.614`]
}
object H {
  
  inline def apply(
    h: js.Tuple2[typings.culori.culoriInts.`0`, `360`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`],
    s: js.Tuple2[typings.culori.culoriInts.`0`, `4.614`]
  ): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
    
    inline def setH(value: js.Tuple2[typings.culori.culoriInts.`0`, `360`]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setS(value: js.Tuple2[typings.culori.culoriInts.`0`, `4.614`]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
