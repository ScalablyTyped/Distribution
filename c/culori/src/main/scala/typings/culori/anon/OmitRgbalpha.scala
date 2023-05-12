package typings.culori.anon

import typings.culori.culoriStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/rgb/types.Rgb, 'alpha'> */
trait OmitRgbalpha extends StObject {
  
  var b: Double
  
  var g: Double
  
  var mode: rgb
  
  var r: Double
}
object OmitRgbalpha {
  
  inline def apply(b: Double, g: Double, r: Double): OmitRgbalpha = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], mode = "rgb", r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRgbalpha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitRgbalpha] (val x: Self) extends AnyVal {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setMode(value: rgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
