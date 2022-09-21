package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeParameterInstantiation_
  extends StObject
     with BaseNode
     with TypeScript {
  
  var params: js.Array[TSType]
  
  @JSName("type")
  var type_TSTypeParameterInstantiation_ : TSTypeParameterInstantiation
}
object TSTypeParameterInstantiation_ {
  
  inline def apply(params: js.Array[TSType]): TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[TSTypeParameterInstantiation_]
  }
  
  extension [Self <: TSTypeParameterInstantiation_](x: Self) {
    
    inline def setParams(value: js.Array[TSType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TSType*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
