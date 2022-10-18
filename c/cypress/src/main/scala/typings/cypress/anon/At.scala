package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait At extends StObject {
  
  var at: js.UndefOr[Double] = js.undefined
  
  var next: String
}
object At {
  
  inline def apply(next: String): At = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
  
  extension [Self <: At](x: Self) {
    
    inline def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
  }
}
