package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
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
  implicit class TypeParameterDeclaration_Ops[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsVarargs(value: TypeParameter_ *): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[TypeParameter_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeParameterDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
