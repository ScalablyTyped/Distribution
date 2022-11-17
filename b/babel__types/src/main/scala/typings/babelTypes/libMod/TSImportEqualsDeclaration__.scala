package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSImportEqualsDeclaration__
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  var importKind: js.UndefOr["type" | "value" | Null] = js.undefined
  
  var isExport: Boolean
  
  var moduleReference: TSEntityName | TSExternalModuleReference__
  
  @JSName("type")
  var type_TSImportEqualsDeclaration__ : "TSImportEqualsDeclaration"
}
object TSImportEqualsDeclaration__ {
  
  inline def apply(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference__): TSImportEqualsDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[TSImportEqualsDeclaration__]
  }
  
  extension [Self <: TSImportEqualsDeclaration__](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImportKind(value: "type" | "value"): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setImportKindUndefined: Self = StObject.set(x, "importKind", js.undefined)
    
    inline def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    inline def setModuleReference(value: TSEntityName | TSExternalModuleReference__): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSImportEqualsDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
