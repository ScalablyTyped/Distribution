package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumStringMember_
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  var init: StringLiteral_
  
  @JSName("type")
  var type_EnumStringMember_ : "EnumStringMember"
}
object EnumStringMember_ {
  
  inline def apply(id: Identifier_, init: StringLiteral_): EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[EnumStringMember_]
  }
  
  extension [Self <: EnumStringMember_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: StringLiteral_): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: "EnumStringMember"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
