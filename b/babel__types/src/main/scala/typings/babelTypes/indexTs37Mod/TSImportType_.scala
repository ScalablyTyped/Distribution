package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSImportType_
  extends StObject
     with BaseNode
     with TSType {
  
  var argument: StringLiteral_
  
  var qualifier: TSEntityName | Null
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSImportType_ : TSImportType
}
object TSImportType_ {
  
  inline def apply(argument: StringLiteral_): TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, qualifier = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[TSImportType_]
  }
  
  extension [Self <: TSImportType_](x: Self) {
    
    inline def setArgument(value: StringLiteral_): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: TSEntityName): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierNull: Self = StObject.set(x, "qualifier", null)
    
    inline def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
