package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait NumberTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_NumberTypeAnnotation_ : NumberTypeAnnotation = js.native
}
object NumberTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: NumberTypeAnnotation): NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NumberTypeAnnotation_MutableBuilder[Self <: NumberTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
