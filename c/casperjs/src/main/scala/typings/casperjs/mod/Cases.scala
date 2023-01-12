package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cases extends StObject {
  
  var cases: js.Array[Case]
  
  var length: Double
}
object Cases {
  
  inline def apply(cases: js.Array[Case], length: Double): Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cases] (val x: Self) extends AnyVal {
    
    inline def setCases(value: js.Array[Case]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: Case*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
