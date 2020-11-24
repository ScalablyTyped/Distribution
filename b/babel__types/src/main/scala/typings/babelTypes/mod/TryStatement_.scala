package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TryStatement_
  extends Statement
     with BaseNode {
  
  var block: BlockStatement_ = js.native
  
  var finalizer: BlockStatement_ | Null = js.native
  
  var handler: CatchClause_ | Null = js.native
  
  @JSName("type")
  var type_TryStatement_ : TryStatement = js.native
}
object TryStatement_ {
  
  @scala.inline
  def apply(block: BlockStatement_, `type`: TryStatement): TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement_]
  }
  
  @scala.inline
  implicit class TryStatement_Ops[Self <: TryStatement_] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: BlockStatement_): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TryStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizer(value: BlockStatement_): Self = this.set("finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizerNull: Self = this.set("finalizer", null)
    
    @scala.inline
    def setHandler(value: CatchClause_): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
  }
}
