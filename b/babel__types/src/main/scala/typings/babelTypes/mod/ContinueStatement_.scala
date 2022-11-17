package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement_
  extends StObject
     with BaseNode {
  
  var label: Identifier_ | Null
  
  @JSName("type")
  var type_ContinueStatement_ : "ContinueStatement"
}
object ContinueStatement_ {
  
  inline def apply(): ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  extension [Self <: ContinueStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setType(value: "ContinueStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
