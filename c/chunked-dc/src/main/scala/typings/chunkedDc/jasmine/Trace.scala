package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trace extends StObject {
  
  var message: String
  
  var name: String
  
  var stack: scala.Any
}
object Trace {
  
  inline def apply(message: String, name: String, stack: scala.Any): Trace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
  
  extension [Self <: Trace](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: scala.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
