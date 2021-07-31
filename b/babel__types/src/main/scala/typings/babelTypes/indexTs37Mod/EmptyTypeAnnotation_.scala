package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait EmptyTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_EmptyTypeAnnotation_ : EmptyTypeAnnotation
}
object EmptyTypeAnnotation_ {
  
  @scala.inline
  def apply(): EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[EmptyTypeAnnotation_]
  }
  
  @scala.inline
  implicit class EmptyTypeAnnotation_MutableBuilder[Self <: EmptyTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
