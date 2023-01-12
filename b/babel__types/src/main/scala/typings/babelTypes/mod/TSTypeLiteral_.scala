package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeLiteral_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  var members: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSTypeLiteral_ : TSTypeLiteral
}
object TSTypeLiteral_ {
  
  inline def apply(members: js.Array[TSTypeElement]): TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[TSTypeLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeLiteral_] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[TSTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSTypeElement*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
