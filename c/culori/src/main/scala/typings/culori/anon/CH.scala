package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CH extends StObject {
  
  var c: Double
  
  var h: Double
}
object CH {
  
  inline def apply(c: Double, h: Double): CH = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[CH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CH] (val x: Self) extends AnyVal {
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
  }
}
