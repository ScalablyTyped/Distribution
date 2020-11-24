package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSInferType_
  extends TSType
     with BaseNode {
  
  var typeParameter: TSTypeParameter_ = js.native
  
  @JSName("type")
  var type_TSInferType_ : TSInferType = js.native
}
object TSInferType_ {
  
  @scala.inline
  def apply(`type`: TSInferType, typeParameter: TSTypeParameter_): TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInferType_]
  }
  
  @scala.inline
  implicit class TSInferType_Ops[Self <: TSInferType_] (val x: Self) extends AnyVal {
    
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
    def setType(value: TSInferType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: TSTypeParameter_): Self = this.set("typeParameter", value.asInstanceOf[js.Any])
  }
}
