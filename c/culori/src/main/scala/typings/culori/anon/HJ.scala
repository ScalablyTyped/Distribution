package typings.culori.anon

import typings.culori.culoriDoubles.`0.19`
import typings.culori.culoriDoubles.`0.221`
import typings.culori.culoriInts.`360`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HJ extends StObject {
  
  var c: js.Tuple2[typings.culori.culoriInts.`0`, `0.19`]
  
  var h: js.Tuple2[typings.culori.culoriInts.`0`, `360`]
  
  var j: js.Tuple2[typings.culori.culoriInts.`0`, `0.221`]
}
object HJ {
  
  inline def apply(
    c: js.Tuple2[typings.culori.culoriInts.`0`, `0.19`],
    h: js.Tuple2[typings.culori.culoriInts.`0`, `360`],
    j: js.Tuple2[typings.culori.culoriInts.`0`, `0.221`]
  ): HJ = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[HJ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HJ] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.19`]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: js.Tuple2[typings.culori.culoriInts.`0`, `360`]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setJ(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.221`]): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
