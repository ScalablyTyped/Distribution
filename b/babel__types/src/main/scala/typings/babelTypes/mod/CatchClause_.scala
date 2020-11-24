package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait CatchClause_
  extends BlockParent
     with BaseNode
     with Scopable {
  
  var body: BlockStatement_ = js.native
  
  var param: Identifier_ | ArrayPattern_ | ObjectPattern_ | Null = js.native
  
  @JSName("type")
  var type_CatchClause_ : CatchClause = js.native
}
object CatchClause_ {
  
  @scala.inline
  def apply(body: BlockStatement_, `type`: CatchClause): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
  
  @scala.inline
  implicit class CatchClause_Ops[Self <: CatchClause_] (val x: Self) extends AnyVal {
    
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
    def setType(value: CatchClause): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Identifier_ | ArrayPattern_ | ObjectPattern_): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = this.set("param", null)
  }
}
