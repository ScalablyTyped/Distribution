package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined colord.colord/types.WithAlpha<colord.colord/types.LchColor> */
trait LchaColor
  extends StObject
     with ObjectColor {
  
  var a: Double
  
  var c: Double
  
  var h: Double
  
  var l: Double
}
object LchaColor {
  
  inline def apply(a: Double, c: Double, h: Double, l: Double): LchaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[LchaColor]
  }
  
  extension [Self <: LchaColor](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
