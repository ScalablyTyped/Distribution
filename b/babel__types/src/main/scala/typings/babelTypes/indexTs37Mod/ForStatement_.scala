package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ForStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ForStatement_
  extends BlockParent
     with BaseNode
     with For
     with Loop
     with Scopable
     with Statement {
  
  var body: Statement = js.native
  
  var init: VariableDeclaration_ | Expression | Null = js.native
  
  var test: Expression | Null = js.native
  
  @JSName("type")
  var type_ForStatement_ : ForStatement = js.native
  
  var update: Expression | Null = js.native
}
object ForStatement_ {
  
  @scala.inline
  def apply(body: Statement, `type`: ForStatement): ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement_]
  }
  
  @scala.inline
  implicit class ForStatement_Ops[Self <: ForStatement_] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ForStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: VariableDeclaration_ | Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = this.set("init", null)
    
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = this.set("test", null)
    
    @scala.inline
    def setUpdate(value: Expression): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
}
