package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.Timeoutable> */
trait PartialTimeoutable extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialTimeoutable {
  
  inline def apply(): PartialTimeoutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTimeoutable]
  }
  
  extension [Self <: PartialTimeoutable](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
