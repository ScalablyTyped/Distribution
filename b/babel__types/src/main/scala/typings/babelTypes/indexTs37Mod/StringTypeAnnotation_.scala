package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.StringTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait StringTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_StringTypeAnnotation_ : StringTypeAnnotation = js.native
}
object StringTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: StringTypeAnnotation): StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringTypeAnnotation_]
  }
  
  @scala.inline
  implicit class StringTypeAnnotation_MutableBuilder[Self <: StringTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
