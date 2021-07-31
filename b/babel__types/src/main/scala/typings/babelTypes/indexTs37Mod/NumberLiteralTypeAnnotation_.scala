package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait NumberLiteralTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_NumberLiteralTypeAnnotation_ : NumberLiteralTypeAnnotation
  
  var value: Double
}
object NumberLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(value: Double): NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[NumberLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NumberLiteralTypeAnnotation_MutableBuilder[Self <: NumberLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
