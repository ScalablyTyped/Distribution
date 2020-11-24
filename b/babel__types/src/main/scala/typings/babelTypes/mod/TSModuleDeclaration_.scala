package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSModuleDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  
  var body: TSModuleBlock_ | TSModuleDeclaration_ = js.native
  
  var declare: Boolean | Null = js.native
  
  var global: Boolean | Null = js.native
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSModuleDeclaration_ : TSModuleDeclaration = js.native
}
object TSModuleDeclaration_ {
  
  @scala.inline
  def apply(
    body: TSModuleBlock_ | TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration
  ): TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration_]
  }
  
  @scala.inline
  implicit class TSModuleDeclaration_Ops[Self <: TSModuleDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setBody(value: TSModuleBlock_ | TSModuleDeclaration_): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSModuleDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNull: Self = this.set("global", null)
  }
}
