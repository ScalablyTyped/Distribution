package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait GenericTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  var id: Identifier_ | QualifiedTypeIdentifier_ = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_GenericTypeAnnotation_ : GenericTypeAnnotation = js.native
}
object GenericTypeAnnotation_ {
  
  @scala.inline
  def apply(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeAnnotation_]
  }
  
  @scala.inline
  implicit class GenericTypeAnnotation_MutableBuilder[Self <: GenericTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: GenericTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
