package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait AnyTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_AnyTypeAnnotation_ : AnyTypeAnnotation
}
object AnyTypeAnnotation_ {
  
  @scala.inline
  def apply(): AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[AnyTypeAnnotation_]
  }
  
  @scala.inline
  implicit class AnyTypeAnnotation_MutableBuilder[Self <: AnyTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AnyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
