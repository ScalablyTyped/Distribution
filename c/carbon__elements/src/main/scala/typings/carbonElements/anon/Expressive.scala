package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expressive extends StObject {
  
  var expressive: String
  
  var productive: String
}
object Expressive {
  
  inline def apply(): Expressive = {
    val __obj = js.Dynamic.literal(expressive = "cubic-bezier(0.4, 0.14, 0.3, 1)", productive = "cubic-bezier(0.2, 0, 0.38, 0.9)")
    __obj.asInstanceOf[Expressive]
  }
  
  extension [Self <: Expressive](x: Self) {
    
    inline def setExpressive(value: String): Self = StObject.set(x, "expressive", value.asInstanceOf[js.Any])
    
    inline def setProductive(value: String): Self = StObject.set(x, "productive", value.asInstanceOf[js.Any])
  }
}
