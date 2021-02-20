package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ClassImplements_
  extends Flow
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_ClassImplements_ : ClassImplements = js.native
}
object ClassImplements_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: ClassImplements): ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassImplements_]
  }
  
  @scala.inline
  implicit class ClassImplements_MutableBuilder[Self <: ClassImplements_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassImplements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
