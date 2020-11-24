package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DeclareModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareModule_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: BlockStatement_ = js.native
  
  var id: StringLiteral_ | Identifier_ = js.native
  
  @JSName("type")
  var type_DeclareModule_ : DeclareModule = js.native
}
object DeclareModule_ {
  
  @scala.inline
  def apply(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareModule
  ): DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule_]
  }
  
  @scala.inline
  implicit class DeclareModule_Ops[Self <: DeclareModule_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StringLiteral_ | Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareModule): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
