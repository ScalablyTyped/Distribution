package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TypeParameter_
  extends Flow
     with BaseNode {
  
  var bound: TypeAnnotation_ | Null = js.native
  
  var default: FlowType | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_TypeParameter_ : TypeParameter = js.native
  
  var variance: Variance_ | Null = js.native
}
object TypeParameter_ {
  
  @scala.inline
  def apply(name: String, `type`: TypeParameter): TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter_]
  }
  
  @scala.inline
  implicit class TypeParameter_Ops[Self <: TypeParameter_] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeParameter): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBound(value: TypeAnnotation_): Self = this.set("bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundNull: Self = this.set("bound", null)
    
    @scala.inline
    def setDefault(value: FlowType): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setVariance(value: Variance_): Self = this.set("variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = this.set("variance", null)
  }
}
