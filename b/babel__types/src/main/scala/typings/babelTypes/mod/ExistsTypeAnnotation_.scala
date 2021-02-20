package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ExistsTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  @JSName("type")
  var type_ExistsTypeAnnotation_ : ExistsTypeAnnotation = js.native
}
object ExistsTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: ExistsTypeAnnotation): ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistsTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ExistsTypeAnnotation_MutableBuilder[Self <: ExistsTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExistsTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
