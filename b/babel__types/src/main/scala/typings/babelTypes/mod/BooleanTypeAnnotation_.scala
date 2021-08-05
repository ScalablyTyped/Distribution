package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait BooleanTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_BooleanTypeAnnotation_ : BooleanTypeAnnotation
}
object BooleanTypeAnnotation_ {
  
  inline def apply(): BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[BooleanTypeAnnotation_]
  }
  
  extension [Self <: BooleanTypeAnnotation_](x: Self) {
    
    inline def setType(value: BooleanTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
