package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNamedTupleMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamedTupleMember_
  extends BaseNode
     with _Node {
  
  var elementType: TSType = js.native
  
  var label: Identifier_ = js.native
  
  var optional: Boolean = js.native
  
  @JSName("type")
  var type_TSNamedTupleMember_ : TSNamedTupleMember = js.native
}
object TSNamedTupleMember_ {
  
  @scala.inline
  def apply(elementType: TSType, label: Identifier_, optional: Boolean, `type`: TSNamedTupleMember): TSNamedTupleMember_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNamedTupleMember_]
  }
  
  @scala.inline
  implicit class TSNamedTupleMember_Ops[Self <: TSNamedTupleMember_] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: Identifier_): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSNamedTupleMember): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
