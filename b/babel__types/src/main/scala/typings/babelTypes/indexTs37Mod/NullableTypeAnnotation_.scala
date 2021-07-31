package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait NullableTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation
}
object NullableTypeAnnotation_ {
  
  @scala.inline
  def apply(typeAnnotation: FlowType): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NullableTypeAnnotation_MutableBuilder[Self <: NullableTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
