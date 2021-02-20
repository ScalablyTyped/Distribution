package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait MixedTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation = js.native
}
object MixedTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: MixedTypeAnnotation): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  @scala.inline
  implicit class MixedTypeAnnotation_MutableBuilder[Self <: MixedTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
