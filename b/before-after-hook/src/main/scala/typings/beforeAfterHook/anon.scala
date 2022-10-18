package typings.beforeAfterHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var Error: Any
    
    var Options: Any
    
    var Result: Any
  }
  object Error {
    
    inline def apply(Error: Any, Options: Any, Result: Any): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    }
  }
}
