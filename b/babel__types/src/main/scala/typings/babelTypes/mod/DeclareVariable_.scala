package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareVariable_
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  @JSName("type")
  var type_DeclareVariable_ : "DeclareVariable"
}
object DeclareVariable_ {
  
  inline def apply(id: Identifier_): DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[DeclareVariable_]
  }
  
  extension [Self <: DeclareVariable_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: "DeclareVariable"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
