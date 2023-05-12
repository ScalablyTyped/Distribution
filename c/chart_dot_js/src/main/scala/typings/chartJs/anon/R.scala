package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var r: Any
}
object R {
  
  inline def apply(r: Any): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    inline def setR(value: Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
