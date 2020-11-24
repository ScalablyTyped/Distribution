package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait BreakStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null = js.native
  
  @JSName("type")
  var type_BreakStatement_ : BreakStatement = js.native
}
object BreakStatement_ {
  
  @scala.inline
  def apply(`type`: BreakStatement): BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement_]
  }
  
  @scala.inline
  implicit class BreakStatement_Ops[Self <: BreakStatement_] (val x: Self) extends AnyVal {
    
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
    def setType(value: BreakStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier_): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
  }
}
