package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/xyz50/types.Xyz50, 'mode'> */
trait OmitXyz50mode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object OmitXyz50mode {
  
  inline def apply(x: Double, y: Double, z: Double): OmitXyz50mode = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitXyz50mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitXyz50mode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
