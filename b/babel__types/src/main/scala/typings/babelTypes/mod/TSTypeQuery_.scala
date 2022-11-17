package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeQuery_
  extends StObject
     with BaseNode {
  
  var exprName: TSEntityName | TSImportType_
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSTypeQuery_ : "TSTypeQuery"
}
object TSTypeQuery_ {
  
  inline def apply(exprName: TSEntityName | TSImportType_): TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[TSTypeQuery_]
  }
  
  extension [Self <: TSTypeQuery_](x: Self) {
    
    inline def setExprName(value: TSEntityName | TSImportType_): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSTypeQuery"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
