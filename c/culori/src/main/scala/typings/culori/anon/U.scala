package typings.culori.anon

import typings.culori.culoriDoubles.`-125.882`
import typings.culori.culoriDoubles.`-84.936`
import typings.culori.culoriDoubles.`175.042`
import typings.culori.culoriDoubles.`87.243`
import typings.culori.culoriInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait U extends StObject {
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
  
  var u: js.Tuple2[`-84.936`, `175.042`]
  
  var v: js.Tuple2[`-125.882`, `87.243`]
}
object U {
  
  inline def apply(
    l: js.Tuple2[typings.culori.culoriInts.`0`, `100`],
    u: js.Tuple2[`-84.936`, `175.042`],
    v: js.Tuple2[`-125.882`, `87.243`]
  ): U = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[U]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: U] (val x: Self) extends AnyVal {
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `100`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setU(value: js.Tuple2[`-84.936`, `175.042`]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setV(value: js.Tuple2[`-125.882`, `87.243`]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
