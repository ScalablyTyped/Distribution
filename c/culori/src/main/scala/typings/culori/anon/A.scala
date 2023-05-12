package typings.culori.anon

import typings.culori.culoriDoubles.`-40.09`
import typings.culori.culoriDoubles.`-40.469`
import typings.culori.culoriDoubles.`44.344`
import typings.culori.culoriDoubles.`45.501`
import typings.culori.culoriInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A extends StObject {
  
  var a: js.Tuple2[`-40.09`, `45.501`]
  
  var b: js.Tuple2[`-40.469`, `44.344`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
}
object A {
  
  inline def apply(
    a: js.Tuple2[`-40.09`, `45.501`],
    b: js.Tuple2[`-40.469`, `44.344`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, `100`]
  ): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: A] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Tuple2[`-40.09`, `45.501`]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Tuple2[`-40.469`, `44.344`]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `100`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
