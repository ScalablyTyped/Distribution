package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ThisTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_ThisTypeAnnotation_ : ThisTypeAnnotation = js.native
}
object ThisTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: ThisTypeAnnotation): ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ThisTypeAnnotation_MutableBuilder[Self <: ThisTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
