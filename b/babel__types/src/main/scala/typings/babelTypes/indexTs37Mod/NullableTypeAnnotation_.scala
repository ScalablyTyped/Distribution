package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait NullableTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var typeAnnotation: FlowType = js.native
  
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation = js.native
}
object NullableTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  
  @scala.inline
  implicit class NullableTypeAnnotation_MutableBuilder[Self <: NullableTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
