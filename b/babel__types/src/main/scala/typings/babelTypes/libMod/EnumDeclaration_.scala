package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with Node
     with Statement {
  
  var body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_
  
  var id: Identifier_
  
  @JSName("type")
  var type_EnumDeclaration_ : EnumDeclaration
}
object EnumDeclaration_ {
  
  inline def apply(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[EnumDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
