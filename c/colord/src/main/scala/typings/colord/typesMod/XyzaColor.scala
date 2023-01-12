package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined colord.colord/types.WithAlpha<colord.colord/types.XyzColor> */
trait XyzaColor
  extends StObject
     with ObjectColor {
  
  var a: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object XyzaColor {
  
  inline def apply(a: Double, x: Double, y: Double, z: Double): XyzaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[XyzaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XyzaColor] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
