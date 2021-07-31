package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TupleTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_TupleTypeAnnotation_ : TupleTypeAnnotation
  
  var types: js.Array[FlowType]
}
object TupleTypeAnnotation_ {
  
  @scala.inline
  def apply(types: js.Array[FlowType]): TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[TupleTypeAnnotation_]
  }
  
  @scala.inline
  implicit class TupleTypeAnnotation_MutableBuilder[Self <: TupleTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TupleTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
