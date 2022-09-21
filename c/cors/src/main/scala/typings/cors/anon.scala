package typings.cors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    def end(): Any
    
    def setHeader(key: String, value: String): Any
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object End {
    
    inline def apply(end: () => Any, setHeader: (String, String) => Any): End = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), setHeader = js.Any.fromFunction2(setHeader))
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: () => Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setSetHeader(value: (String, String) => Any): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
