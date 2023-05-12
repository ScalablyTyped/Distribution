package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hi extends StObject {
  
  var hi: Double
  
  var lo: Double
}
object Hi {
  
  inline def apply(hi: Double, lo: Double): Hi = {
    val __obj = js.Dynamic.literal(hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hi] (val x: Self) extends AnyVal {
    
    inline def setHi(value: Double): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
    
    inline def setLo(value: Double): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
  }
}
