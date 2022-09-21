package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeQuery
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var exprName: TSEntityName | TSImportType
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypeQuery: typings.babelTypes.babelTypesStrings.TSTypeQuery
}
object TSTypeQuery {
  
  inline def apply(exprName: TSEntityName | TSImportType): TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[TSTypeQuery]
  }
  
  extension [Self <: TSTypeQuery](x: Self) {
    
    inline def setExprName(value: TSEntityName | TSImportType): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
