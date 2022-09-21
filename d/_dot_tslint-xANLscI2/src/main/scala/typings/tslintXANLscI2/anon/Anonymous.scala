package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anonymous extends StObject {
  
  var anonymous: String
  
  var asyncArrow: String
  
  var constructor: String
  
  var method: String
  
  var named: String
}
object Anonymous {
  
  inline def apply(anonymous: String, asyncArrow: String, constructor: String, method: String, named: String): Anonymous = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], asyncArrow = asyncArrow.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anonymous]
  }
  
  extension [Self <: Anonymous](x: Self) {
    
    inline def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAsyncArrow(value: String): Self = StObject.set(x, "asyncArrow", value.asInstanceOf[js.Any])
    
    inline def setConstructor(value: String): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNamed(value: String): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
  }
}
