package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ExportDefaultSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var exported: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportDefaultSpecifier_ : ExportDefaultSpecifier = js.native
}
object ExportDefaultSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_, `type`: ExportDefaultSpecifier): ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit class ExportDefaultSpecifier_Ops[Self <: ExportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
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
    def setExported(value: Identifier_): Self = this.set("exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportDefaultSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
