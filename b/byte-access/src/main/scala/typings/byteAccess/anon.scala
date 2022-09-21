package typings.byteAccess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def get(index: Double): Double
    
    def set(index: Double, value: Double): Unit
  }
  object Get {
    
    inline def apply(get: Double => Double, set: (Double, Double) => Unit): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: Double => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
