package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TypeAnnotation_
  extends Flow
     with BaseNode {
  
  var typeAnnotation: FlowType = js.native
  
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation = js.native
}
object TypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: TypeAnnotation, typeAnnotation: FlowType): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  @scala.inline
  implicit class TypeAnnotation_MutableBuilder[Self <: TypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
