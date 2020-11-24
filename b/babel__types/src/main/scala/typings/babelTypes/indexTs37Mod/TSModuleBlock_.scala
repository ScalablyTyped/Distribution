package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSModuleBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSModuleBlock_
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  
  var body: js.Array[Statement] = js.native
  
  @JSName("type")
  var type_TSModuleBlock_ : TSModuleBlock = js.native
}
object TSModuleBlock_ {
  
  @scala.inline
  def apply(body: js.Array[Statement], `type`: TSModuleBlock): TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleBlock_]
  }
  
  @scala.inline
  implicit class TSModuleBlock_Ops[Self <: TSModuleBlock_] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSModuleBlock): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
