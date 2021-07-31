package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DeclareModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareModule_
  extends StObject
     with Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: BlockStatement_
  
  var id: StringLiteral_ | Identifier_
  
  @JSName("type")
  var type_DeclareModule_ : DeclareModule
}
object DeclareModule_ {
  
  @scala.inline
  def apply(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double
  ): DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[DeclareModule_]
  }
  
  @scala.inline
  implicit class DeclareModule_MutableBuilder[Self <: DeclareModule_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StringLiteral_ | Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
