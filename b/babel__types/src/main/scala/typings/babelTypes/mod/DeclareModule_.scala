package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CommonJS
import typings.babelTypes.babelTypesStrings.DeclareModule
import typings.babelTypes.babelTypesStrings.ES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareModule_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: BlockStatement_
  
  var id: Identifier_ | StringLiteral_
  
  var kind: CommonJS | ES | Null
  
  @JSName("type")
  var type_DeclareModule_ : DeclareModule
}
object DeclareModule_ {
  
  @scala.inline
  def apply(body: BlockStatement_, id: Identifier_ | StringLiteral_): DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, kind = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[DeclareModule_]
  }
  
  @scala.inline
  implicit class DeclareModule_MutableBuilder[Self <: DeclareModule_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: CommonJS | ES): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindNull: Self = StObject.set(x, "kind", null)
    
    @scala.inline
    def setType(value: DeclareModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
