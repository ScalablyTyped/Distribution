package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait InterfaceTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var body: ObjectTypeAnnotation_ = js.native
  
  var `extends`: js.Array[InterfaceExtends_] | Null = js.native
  
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : InterfaceTypeAnnotation = js.native
}
object InterfaceTypeAnnotation_ {
  
  @scala.inline
  def apply(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
