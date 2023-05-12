package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HNumber extends StObject {
  
  var h: Double
}
object HNumber {
  
  inline def apply(h: Double): HNumber = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[HNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HNumber] (val x: Self) extends AnyVal {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
  }
}
