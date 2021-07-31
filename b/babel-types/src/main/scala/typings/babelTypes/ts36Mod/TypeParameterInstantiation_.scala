package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParameterInstantiation_
  extends StObject
     with Node
     with Flow {
  
  var params: js.Array[FlowTypeAnnotation]
  
  @JSName("type")
  var type_TypeParameterInstantiation_ : TypeParameterInstantiation
}
object TypeParameterInstantiation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, params: js.Array[FlowTypeAnnotation], start: Double): TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[TypeParameterInstantiation_]
  }
  
  @scala.inline
  implicit class TypeParameterInstantiation_MutableBuilder[Self <: TypeParameterInstantiation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[FlowTypeAnnotation]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: FlowTypeAnnotation*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
