package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait NumberTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_NumberTypeAnnotation_ : NumberTypeAnnotation
}
object NumberTypeAnnotation_ {
  
  inline def apply(): NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[NumberTypeAnnotation_]
  }
  
  extension [Self <: NumberTypeAnnotation_](x: Self) {
    
    inline def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
