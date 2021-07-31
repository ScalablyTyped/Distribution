package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait NullLiteralTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_NullLiteralTypeAnnotation_ : NullLiteralTypeAnnotation
}
object NullLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(): NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[NullLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NullLiteralTypeAnnotation_MutableBuilder[Self <: NullLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
