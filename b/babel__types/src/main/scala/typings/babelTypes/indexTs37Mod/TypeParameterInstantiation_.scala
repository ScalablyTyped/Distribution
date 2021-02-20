package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TypeParameterInstantiation_
  extends Flow
     with BaseNode {
  
  var params: js.Array[FlowType] = js.native
  
  @JSName("type")
  var type_TypeParameterInstantiation_ : TypeParameterInstantiation = js.native
}
object TypeParameterInstantiation_ {
  
  @scala.inline
  def apply(params: js.Array[FlowType], `type`: TypeParameterInstantiation): TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterInstantiation_]
  }
  
  @scala.inline
  implicit class TypeParameterInstantiation_MutableBuilder[Self <: TypeParameterInstantiation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[FlowType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: FlowType*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
