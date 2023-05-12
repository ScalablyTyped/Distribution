package typings.culori.anon

import typings.culori.culoriDoubles.`-0.233`
import typings.culori.culoriDoubles.`-0.311`
import typings.culori.culoriDoubles.`0.198`
import typings.culori.culoriDoubles.`0.276`
import typings.culori.culoriDoubles.`0.999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABL extends StObject {
  
  var a: js.Tuple2[`-0.233`, `0.276`]
  
  var b: js.Tuple2[`-0.311`, `0.198`]
  
  var l: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`]
}
object ABL {
  
  inline def apply(
    a: js.Tuple2[`-0.233`, `0.276`],
    b: js.Tuple2[`-0.311`, `0.198`],
    l: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`]
  ): ABL = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ABL] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Tuple2[`-0.233`, `0.276`]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Tuple2[`-0.311`, `0.198`]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
