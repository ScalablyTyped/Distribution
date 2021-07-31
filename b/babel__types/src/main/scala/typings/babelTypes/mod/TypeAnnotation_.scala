package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TypeAnnotation_
  extends StObject
     with BaseNode
     with Flow {
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation
}
object TypeAnnotation_ {
  
  @scala.inline
  def apply(typeAnnotation: FlowType): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  @scala.inline
  implicit class TypeAnnotation_MutableBuilder[Self <: TypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
