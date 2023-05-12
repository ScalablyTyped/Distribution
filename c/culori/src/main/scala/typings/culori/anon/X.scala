package typings.culori.anon

import typings.culori.culoriDoubles.`0.825`
import typings.culori.culoriDoubles.`0.964`
import typings.culori.culoriDoubles.`0.999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: js.Tuple2[typings.culori.culoriInts.`0`, `0.964`]
  
  var y: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`]
  
  var z: js.Tuple2[typings.culori.culoriInts.`0`, `0.825`]
}
object X {
  
  inline def apply(
    x: js.Tuple2[typings.culori.culoriInts.`0`, `0.964`],
    y: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`],
    z: js.Tuple2[typings.culori.culoriInts.`0`, `0.825`]
  ): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    inline def setX(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.964`]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.999`]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: js.Tuple2[typings.culori.culoriInts.`0`, `0.825`]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
