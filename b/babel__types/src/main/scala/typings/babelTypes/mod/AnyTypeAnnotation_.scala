package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait AnyTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_AnyTypeAnnotation_ : AnyTypeAnnotation = js.native
}
object AnyTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: AnyTypeAnnotation): AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyTypeAnnotation_]
  }
  
  @scala.inline
  implicit class AnyTypeAnnotation_MutableBuilder[Self <: AnyTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AnyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
