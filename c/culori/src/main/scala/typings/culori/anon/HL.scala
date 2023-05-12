package typings.culori.anon

import typings.culori.culoriDoubles.`131.207`
import typings.culori.culoriInts.`100`
import typings.culori.culoriInts.`360`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HL extends StObject {
  
  var c: js.Tuple2[typings.culori.culoriInts.`0`, `131.207`]
  
  var h: js.Tuple2[typings.culori.culoriInts.`0`, `360`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
}
object HL {
  
  inline def apply(
    c: js.Tuple2[typings.culori.culoriInts.`0`, `131.207`],
    h: js.Tuple2[typings.culori.culoriInts.`0`, `360`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
  ): HL = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[HL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HL] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[typings.culori.culoriInts.`0`, `131.207`]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: js.Tuple2[typings.culori.culoriInts.`0`, `360`]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `100`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
