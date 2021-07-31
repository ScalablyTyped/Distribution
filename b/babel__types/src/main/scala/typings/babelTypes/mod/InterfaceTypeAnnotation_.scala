package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait InterfaceTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var body: ObjectTypeAnnotation_
  
  var `extends`: js.Array[InterfaceExtends_] | Null
  
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : InterfaceTypeAnnotation
}
object InterfaceTypeAnnotation_ {
  
  @scala.inline
  def apply(body: ObjectTypeAnnotation_): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[InterfaceTypeAnnotation_]
  }
  
  @scala.inline
  implicit class InterfaceTypeAnnotation_MutableBuilder[Self <: InterfaceTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setType(value: InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
