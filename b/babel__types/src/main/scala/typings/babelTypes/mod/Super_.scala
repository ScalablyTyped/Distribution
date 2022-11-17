package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_Super_ : "Super"
}
object Super_ {
  
  inline def apply(): Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super_]
  }
  
  extension [Self <: Super_](x: Self) {
    
    inline def setType(value: "Super"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
