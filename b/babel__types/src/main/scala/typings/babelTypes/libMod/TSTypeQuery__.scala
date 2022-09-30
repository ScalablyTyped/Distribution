package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeQuery__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var exprName: TSEntityName | TSImportType__
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypeQuery__ : TSTypeQuery
}
object TSTypeQuery__ {
  
  inline def apply(exprName: TSEntityName | TSImportType__): TSTypeQuery__ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[TSTypeQuery__]
  }
  
  extension [Self <: TSTypeQuery__](x: Self) {
    
    inline def setExprName(value: TSEntityName | TSImportType__): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
