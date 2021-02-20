package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait VoidTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_VoidTypeAnnotation_ : VoidTypeAnnotation = js.native
}
object VoidTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: VoidTypeAnnotation): VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidTypeAnnotation_]
  }
  
  @scala.inline
  implicit class VoidTypeAnnotation_MutableBuilder[Self <: VoidTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
