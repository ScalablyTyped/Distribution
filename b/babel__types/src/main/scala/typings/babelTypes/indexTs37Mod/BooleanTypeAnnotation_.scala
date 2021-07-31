package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait BooleanTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_BooleanTypeAnnotation_ : BooleanTypeAnnotation
}
object BooleanTypeAnnotation_ {
  
  @scala.inline
  def apply(): BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[BooleanTypeAnnotation_]
  }
  
  @scala.inline
  implicit class BooleanTypeAnnotation_MutableBuilder[Self <: BooleanTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
