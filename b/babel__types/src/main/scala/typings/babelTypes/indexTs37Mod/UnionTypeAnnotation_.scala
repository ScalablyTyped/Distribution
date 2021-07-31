package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait UnionTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_UnionTypeAnnotation_ : UnionTypeAnnotation
  
  var types: js.Array[FlowType]
}
object UnionTypeAnnotation_ {
  
  @scala.inline
  def apply(types: js.Array[FlowType]): UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[UnionTypeAnnotation_]
  }
  
  @scala.inline
  implicit class UnionTypeAnnotation_MutableBuilder[Self <: UnionTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UnionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
