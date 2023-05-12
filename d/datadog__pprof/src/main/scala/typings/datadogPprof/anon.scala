package typings.datadogPprof

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var Async: Double
    
    var Both: Double
    
    var Interrupt: Double
  }
  object Async {
    
    inline def apply(Async: Double, Both: Double, Interrupt: Double): Async = {
      val __obj = js.Dynamic.literal(Async = Async.asInstanceOf[js.Any], Both = Both.asInstanceOf[js.Any], Interrupt = Interrupt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Double): Self = StObject.set(x, "Async", value.asInstanceOf[js.Any])
      
      inline def setBoth(value: Double): Self = StObject.set(x, "Both", value.asInstanceOf[js.Any])
      
      inline def setInterrupt(value: Double): Self = StObject.set(x, "Interrupt", value.asInstanceOf[js.Any])
    }
  }
}
