package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceExtends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait InterfaceExtends_
  extends Flow
     with BaseNode {
  
  var id: Identifier_ | QualifiedTypeIdentifier_ = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_InterfaceExtends_ : InterfaceExtends = js.native
}
object InterfaceExtends_ {
  
  @scala.inline
  def apply(id: Identifier_ | QualifiedTypeIdentifier_, `type`: InterfaceExtends): InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceExtends_]
  }
  
  @scala.inline
  implicit class InterfaceExtends_MutableBuilder[Self <: InterfaceExtends_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InterfaceExtends): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
