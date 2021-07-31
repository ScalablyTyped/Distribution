package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ThisTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_ThisTypeAnnotation_ : ThisTypeAnnotation
}
object ThisTypeAnnotation_ {
  
  @scala.inline
  def apply(): ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[ThisTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ThisTypeAnnotation_MutableBuilder[Self <: ThisTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
