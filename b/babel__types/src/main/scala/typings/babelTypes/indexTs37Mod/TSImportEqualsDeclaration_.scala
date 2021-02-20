package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import org.scalablytyped.runtime.StObject
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
  implicit class TSImportEqualsDeclaration_MutableBuilder[Self <: TSImportEqualsDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleReference(value: TSEntityName | TSExternalModuleReference_): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
