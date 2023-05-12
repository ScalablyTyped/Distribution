package typings.culori.anon

import typings.culori.culoriDoubles.`0.95`
import typings.culori.culoriDoubles.`1.088`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Z extends StObject {
  
  var x: js.Tuple2[typings.culori.culoriInts.`0`, `0.95`]
  
  var y: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`]
  
  var z: js.Tuple2[typings.culori.culoriInts.`0`, `1.088`]
}
object Z {
  
  inline def apply(
    x: js.Tuple2[typings.culori.culoriInts.`0`, `0.95`],
    y: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`],
    z: js.Tuple2[typings.culori.culoriInts.`0`, `1.088`]
  ): Z = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Z]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Z] (val x: Self) extends AnyVal {
    
    inline def setX(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.95`]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: js.Tuple2[typings.culori.culoriInts.`0`, typings.culori.culoriInts.`1`]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: js.Tuple2[typings.culori.culoriInts.`0`, `1.088`]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
