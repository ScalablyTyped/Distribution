package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSArrayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSArrayType_
  extends TSType
     with BaseNode {
  
  var elementType: TSType = js.native
  
  @JSName("type")
  var type_TSArrayType_ : TSArrayType = js.native
}
object TSArrayType_ {
  
  @scala.inline
  def apply(elementType: TSType, `type`: TSArrayType): TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSArrayType_]
  }
  
  @scala.inline
  implicit class TSArrayType_Ops[Self <: TSArrayType_] (val x: Self) extends AnyVal {
    
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
    def setElementType(value: TSType): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSArrayType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
