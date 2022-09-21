package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.CommonJS
import typings.babelTypes.babelTypesStrings.DeclareModule
import typings.babelTypes.babelTypesStrings.ES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareModule_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var body: BlockStatement_
  
  var id: Identifier_ | StringLiteral_
  
  var kind: js.UndefOr[CommonJS | ES | Null] = js.undefined
  
  @JSName("type")
  var type_DeclareModule_ : DeclareModule
}
object DeclareModule_ {
  
  inline def apply(body: BlockStatement_, id: Identifier_ | StringLiteral_): DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[DeclareModule_]
  }
  
  extension [Self <: DeclareModule_](x: Self) {
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: CommonJS | ES): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setType(value: DeclareModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
