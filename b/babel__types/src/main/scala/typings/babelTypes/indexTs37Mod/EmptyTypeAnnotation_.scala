package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait EmptyTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_EmptyTypeAnnotation_ : EmptyTypeAnnotation = js.native
}
object EmptyTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: EmptyTypeAnnotation): EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyTypeAnnotation_]
  }
  
  @scala.inline
  implicit class EmptyTypeAnnotation_MutableBuilder[Self <: EmptyTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
