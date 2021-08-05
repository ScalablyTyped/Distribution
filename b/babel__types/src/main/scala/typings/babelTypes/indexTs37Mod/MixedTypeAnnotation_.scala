package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait MixedTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation
}
object MixedTypeAnnotation_ {
  
  inline def apply(): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  extension [Self <: MixedTypeAnnotation_](x: Self) {
    
    inline def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
