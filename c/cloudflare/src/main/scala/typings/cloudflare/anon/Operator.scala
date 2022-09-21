package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator extends StObject {
  
  var operator: String
  
  var value: String
}
object Operator {
  
  inline def apply(operator: String, value: String): Operator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
  
  extension [Self <: Operator](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
