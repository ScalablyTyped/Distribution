package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeofTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var argument: FlowType
  
  @JSName("type")
  var type_TypeofTypeAnnotation_ : TypeofTypeAnnotation
}
object TypeofTypeAnnotation_ {
  
  @scala.inline
  def apply(argument: FlowType): TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[TypeofTypeAnnotation_]
  }
  
  @scala.inline
  implicit class TypeofTypeAnnotation_MutableBuilder[Self <: TypeofTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: FlowType): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeofTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
