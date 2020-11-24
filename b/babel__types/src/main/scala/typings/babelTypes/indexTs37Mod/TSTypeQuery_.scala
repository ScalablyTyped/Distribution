package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSTypeQuery_
  extends TSType
     with BaseNode {
  
  var exprName: TSEntityName | TSImportType_ = js.native
  
  @JSName("type")
  var type_TSTypeQuery_ : TSTypeQuery = js.native
}
object TSTypeQuery_ {
  
  @scala.inline
  def apply(exprName: TSEntityName | TSImportType_, `type`: TSTypeQuery): TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeQuery_]
  }
  
  @scala.inline
  implicit class TSTypeQuery_Ops[Self <: TSTypeQuery_] (val x: Self) extends AnyVal {
    
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
    def setExprName(value: TSEntityName | TSImportType_): Self = this.set("exprName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeQuery): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
