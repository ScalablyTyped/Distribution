package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAttributeGroupResponse extends js.Object {
  
  /**
    * The updated information of the attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroup] = js.native
}
object UpdateAttributeGroupResponse {
  
  @scala.inline
  def apply(): UpdateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateAttributeGroupResponseOps[Self <: UpdateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributeGroup(value: AttributeGroup): Self = this.set("attributeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeGroup: Self = this.set("attributeGroup", js.undefined)
  }
}
