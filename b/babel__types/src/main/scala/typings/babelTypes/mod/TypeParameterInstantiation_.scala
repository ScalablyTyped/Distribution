package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeParameterInstantiation_
  extends StObject
     with BaseNode
     with Flow {
  
  var params: js.Array[FlowType]
  
  @JSName("type")
  var type_TypeParameterInstantiation_ : TypeParameterInstantiation
}
object TypeParameterInstantiation_ {
  
  inline def apply(params: js.Array[FlowType]): TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[TypeParameterInstantiation_]
  }
  
  extension [Self <: TypeParameterInstantiation_](x: Self) {
    
    inline def setParams(value: js.Array[FlowType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: FlowType*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
