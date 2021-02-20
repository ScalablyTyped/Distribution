package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ArrayTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var elementType: FlowType = js.native
  
  @JSName("type")
  var type_ArrayTypeAnnotation_ : ArrayTypeAnnotation = js.native
}
object ArrayTypeAnnotation_ {
  
  @scala.inline
  def apply(elementType: FlowType, `type`: ArrayTypeAnnotation): ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ArrayTypeAnnotation_MutableBuilder[Self <: ArrayTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: FlowType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
