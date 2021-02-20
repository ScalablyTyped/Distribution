package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TypeParameterDeclaration_
  extends Flow
     with BaseNode {
  
  var params: js.Array[TypeParameter_] = js.native
  
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration = js.native
}
object TypeParameterDeclaration_ {
  
  @scala.inline
  def apply(params: js.Array[TypeParameter_], `type`: TypeParameterDeclaration): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  
  @scala.inline
  implicit class TypeParameterDeclaration_MutableBuilder[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[TypeParameter_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: TypeParameter_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
