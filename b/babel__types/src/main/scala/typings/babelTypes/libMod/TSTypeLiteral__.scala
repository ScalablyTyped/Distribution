package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeLiteral__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var members: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSTypeLiteral__ : TSTypeLiteral
}
object TSTypeLiteral__ {
  
  inline def apply(members: js.Array[TSTypeElement]): TSTypeLiteral__ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[TSTypeLiteral__]
  }
  
  extension [Self <: TSTypeLiteral__](x: Self) {
    
    inline def setMembers(value: js.Array[TSTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSTypeElement*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
