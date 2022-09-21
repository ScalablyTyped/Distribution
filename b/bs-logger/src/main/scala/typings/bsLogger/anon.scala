package typings.bsLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Double
    
    var next: Double
  }
  object From {
    
    inline def apply(from: Double, next: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    }
  }
}
