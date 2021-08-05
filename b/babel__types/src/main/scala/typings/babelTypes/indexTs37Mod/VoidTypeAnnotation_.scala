package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait VoidTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_VoidTypeAnnotation_ : VoidTypeAnnotation
}
object VoidTypeAnnotation_ {
  
  inline def apply(): VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[VoidTypeAnnotation_]
  }
  
  extension [Self <: VoidTypeAnnotation_](x: Self) {
    
    inline def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
