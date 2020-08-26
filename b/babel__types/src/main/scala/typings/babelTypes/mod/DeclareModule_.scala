package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CommonJS
import typings.babelTypes.babelTypesStrings.DeclareModule
import typings.babelTypes.babelTypesStrings.ES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclareModule_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement_ = js.native
  var id: Identifier_ | StringLiteral_ = js.native
  var kind: CommonJS | ES | Null = js.native
  @JSName("type")
  var type_DeclareModule_ : DeclareModule = js.native
}

object DeclareModule_ {
  @scala.inline
  def apply(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
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
    def setId(value: Identifier_ | StringLiteral_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DeclareModule): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: CommonJS | ES): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindNull: Self = this.set("kind", null)
  }
  
}

