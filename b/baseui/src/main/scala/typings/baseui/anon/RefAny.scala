package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefAny extends StObject {
  
  var ref: Any
}
object RefAny {
  
  inline def apply(ref: Any): RefAny = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefAny]
  }
  
  extension [Self <: RefAny](x: Self) {
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
