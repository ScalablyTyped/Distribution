package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSImportEqualsDeclaration
  extends StObject
     with Node
     with Statement {
  
  var id: Identifier_
  
  var isExport: Boolean | Null
  
  var moduleReference: TSEntityName | TSExternalModuleReference
  
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
}
object TSImportEqualsDeclaration {
  
  @JSImport("babel-types", "TSImportEqualsDeclaration")
  @js.native
  def apply(id: Identifier_, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  @JSImport("babel-types", "TSImportEqualsDeclaration")
  @js.native
  def apply(id: Identifier_, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
  
  extension [Self <: TSImportEqualsDeclaration](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    inline def setIsExportNull: Self = StObject.set(x, "isExport", null)
    
    inline def setModuleReference(value: TSEntityName | TSExternalModuleReference): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
