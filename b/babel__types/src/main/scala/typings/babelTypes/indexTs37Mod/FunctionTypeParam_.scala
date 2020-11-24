package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait FunctionTypeParam_
  extends Flow
     with BaseNode {
  
  var name: Identifier_ | Null = js.native
  
  var optional: Boolean | Null = js.native
  
  var typeAnnotation: FlowType = js.native
  
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam = js.native
}
object FunctionTypeParam_ {
  
  @scala.inline
  def apply(`type`: FunctionTypeParam, typeAnnotation: FlowType): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  
  @scala.inline
  implicit class FunctionTypeParam_Ops[Self <: FunctionTypeParam_] (val x: Self) extends AnyVal {
    
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
    def setType(value: FunctionTypeParam): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Identifier_): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
  }
}
