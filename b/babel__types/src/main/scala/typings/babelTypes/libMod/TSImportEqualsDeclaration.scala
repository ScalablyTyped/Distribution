package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSImportEqualsDeclaration
  extends StObject
     with BaseNode
     with Node
     with Statement
     with TypeScript {
  
  var id: Identifier_
  
  var importKind: js.UndefOr[`type` | value | Null] = js.undefined
  
  var isExport: Boolean
  
  var moduleReference: TSEntityName | TSExternalModuleReference
  
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
}
object TSImportEqualsDeclaration {
  
  inline def apply(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
  
  extension [Self <: TSImportEqualsDeclaration](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImportKind(value: `type` | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setImportKindUndefined: Self = StObject.set(x, "importKind", js.undefined)
    
    inline def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    inline def setModuleReference(value: TSEntityName | TSExternalModuleReference): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
