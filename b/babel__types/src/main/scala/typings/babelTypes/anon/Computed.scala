package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computed extends StObject {
  
  var computed: Boolean | Null
}
object Computed {
  
  inline def apply(): Computed = {
    val __obj = js.Dynamic.literal(computed = null)
    __obj.asInstanceOf[Computed]
  }
  
  extension [Self <: Computed](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedNull: Self = StObject.set(x, "computed", null)
  }
}
