package typings.csstoolsPostcssTrigonometricFunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Number extends StObject {
    
    var number: Any
    
    var unit: String
  }
  object Number {
    
    inline def apply(number: Any, unit: String): Number = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
