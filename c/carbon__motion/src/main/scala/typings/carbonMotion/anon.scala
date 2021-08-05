package typings.carbonMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Expressive extends StObject {
    
    var expressive: String
    
    var productive: String
  }
  object Expressive {
    
    inline def apply(expressive: String, productive: String): Expressive = {
      val __obj = js.Dynamic.literal(expressive = expressive.asInstanceOf[js.Any], productive = productive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expressive]
    }
    
    extension [Self <: Expressive](x: Self) {
      
      inline def setExpressive(value: String): Self = StObject.set(x, "expressive", value.asInstanceOf[js.Any])
      
      inline def setProductive(value: String): Self = StObject.set(x, "productive", value.asInstanceOf[js.Any])
    }
  }
}
