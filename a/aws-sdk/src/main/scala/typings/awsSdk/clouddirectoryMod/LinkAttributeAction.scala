package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkAttributeAction extends js.Object {
  
  /**
    * A type that can be either UPDATE_OR_CREATE or DELETE.
    */
  var AttributeActionType: js.UndefOr[UpdateActionType] = js.native
  
  /**
    * The value that you want to update to.
    */
  var AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.native
}
object LinkAttributeAction {
  
  @scala.inline
  def apply(): LinkAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeAction]
  }
  
  @scala.inline
  implicit class LinkAttributeActionOps[Self <: LinkAttributeAction] (val x: Self) extends AnyVal {
    
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
    def setAttributeActionType(value: UpdateActionType): Self = this.set("AttributeActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeActionType: Self = this.set("AttributeActionType", js.undefined)
    
    @scala.inline
    def setAttributeUpdateValue(value: TypedAttributeValue): Self = this.set("AttributeUpdateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeUpdateValue: Self = this.set("AttributeUpdateValue", js.undefined)
  }
}
