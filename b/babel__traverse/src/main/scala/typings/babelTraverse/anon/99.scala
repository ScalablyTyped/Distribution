package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var `type`: "Identifier"
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setType(value: "Identifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
