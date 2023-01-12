package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LchColor
  extends StObject
     with ObjectColor {
  
  var c: Double
  
  var h: Double
  
  var l: Double
}
object LchColor {
  
  inline def apply(c: Double, h: Double, l: Double): LchColor = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[LchColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LchColor] (val x: Self) extends AnyVal {
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
