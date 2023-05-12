package typings.culori.anon

import typings.culori.culoriDoubles.`-107.86`
import typings.culori.culoriDoubles.`-86.182`
import typings.culori.culoriDoubles.`94.477`
import typings.culori.culoriDoubles.`98.234`
import typings.culori.culoriInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BL extends StObject {
  
  var a: js.Tuple2[`-86.182`, `98.234`]
  
  var b: js.Tuple2[`-107.86`, `94.477`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
}
object BL {
  
  inline def apply(
    a: js.Tuple2[`-86.182`, `98.234`],
    b: js.Tuple2[`-107.86`, `94.477`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
  ): BL = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[BL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BL] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Tuple2[`-86.182`, `98.234`]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Tuple2[`-107.86`, `94.477`]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `100`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
