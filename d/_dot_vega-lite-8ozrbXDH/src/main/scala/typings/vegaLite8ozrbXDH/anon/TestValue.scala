package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestValue extends StObject {
  
  var field: Unit
  
  var test: String
  
  var value: Double
}
object TestValue {
  
  inline def apply(field: Unit, test: String, value: Double): TestValue = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestValue]
  }
  
  extension [Self <: TestValue](x: Self) {
    
    inline def setField(value: Unit): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
