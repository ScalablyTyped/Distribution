package typings.culori.anon

import typings.culori.culoriDoubles.`-112.029`
import typings.culori.culoriDoubles.`-79.287`
import typings.culori.culoriDoubles.`93.388`
import typings.culori.culoriDoubles.`93.55`
import typings.culori.culoriInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AB extends StObject {
  
  var a: js.Tuple2[`-79.287`, `93.55`]
  
  var b: js.Tuple2[`-112.029`, `93.388`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
}
object AB {
  
  inline def apply(
    a: js.Tuple2[`-79.287`, `93.55`],
    b: js.Tuple2[`-112.029`, `93.388`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
  ): AB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[AB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AB] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Tuple2[`-79.287`, `93.55`]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Tuple2[`-112.029`, `93.388`]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `100`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
