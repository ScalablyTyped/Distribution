package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSImportEqualsDeclaration_
  extends Statement
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var isExport: Boolean = js.native
  
  var moduleReference: TSEntityName | TSExternalModuleReference_ = js.native
  
  @JSName("type")
  var type_TSImportEqualsDeclaration_ : TSImportEqualsDeclaration = js.native
}
object TSImportEqualsDeclaration_ {
  
  @scala.inline
  def apply(
    id: Identifier_,
    isExport: Boolean,
    moduleReference: TSEntityName | TSExternalModuleReference_,
    `type`: TSImportEqualsDeclaration
  ): TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportEqualsDeclaration_]
  }
  
  @scala.inline
  implicit class TSImportEqualsDeclaration_Ops[Self <: TSImportEqualsDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExport(value: Boolean): Self = this.set("isExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleReference(value: TSEntityName | TSExternalModuleReference_): Self = this.set("moduleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSImportEqualsDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
