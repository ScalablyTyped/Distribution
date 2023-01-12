package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSImportType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var argument: StringLiteral_
  
  var qualifier: js.UndefOr[TSEntityName | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSImportType__ : TSImportType
}
object TSImportType__ {
  
  inline def apply(argument: StringLiteral_): TSImportType__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[TSImportType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSImportType__] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: StringLiteral_): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: TSEntityName): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierNull: Self = StObject.set(x, "qualifier", null)
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
