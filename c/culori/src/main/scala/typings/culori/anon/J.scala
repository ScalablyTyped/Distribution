package typings.culori.anon

import typings.culori.culoriDoubles.`-0.109`
import typings.culori.culoriDoubles.`-0.185`
import typings.culori.culoriDoubles.`0.129`
import typings.culori.culoriDoubles.`0.134`
import typings.culori.culoriDoubles.`0.222`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait J extends StObject {
  
  var a: js.Tuple2[`-0.109`, `0.129`]
  
  var b: js.Tuple2[`-0.185`, `0.134`]
  
  var j: js.Tuple2[typings.culori.culoriInts.`0`, `0.222`]
}
object J {
  
  inline def apply(
    a: js.Tuple2[`-0.109`, `0.129`],
    b: js.Tuple2[`-0.185`, `0.134`],
    j: js.Tuple2[typings.culori.culoriInts.`0`, `0.222`]
  ): J = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[J]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: J] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Tuple2[`-0.109`, `0.129`]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Tuple2[`-0.185`, `0.134`]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setJ(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.222`]): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
