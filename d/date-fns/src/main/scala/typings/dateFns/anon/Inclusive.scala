package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inclusive extends StObject {
  
  var inclusive: js.UndefOr[Boolean] = js.undefined
}
object Inclusive {
  
  inline def apply(): Inclusive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inclusive]
  }
  
  extension [Self <: Inclusive](x: Self) {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
  }
}
