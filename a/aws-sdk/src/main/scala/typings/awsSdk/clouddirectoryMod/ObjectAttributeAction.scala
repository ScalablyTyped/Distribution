package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAttributeAction extends js.Object {
  
  /**
    * A type that can be either Update or Delete.
    */
  var ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.native
  
  /**
    * The value that you want to update to.
    */
  var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.native
}
object ObjectAttributeAction {
  
  @scala.inline
  def apply(): ObjectAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeAction]
  }
  
  @scala.inline
  implicit class ObjectAttributeActionOps[Self <: ObjectAttributeAction] (val x: Self) extends AnyVal {
    
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
    def setObjectAttributeActionType(value: UpdateActionType): Self = this.set("ObjectAttributeActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAttributeActionType: Self = this.set("ObjectAttributeActionType", js.undefined)
    
    @scala.inline
    def setObjectAttributeUpdateValue(value: TypedAttributeValue): Self = this.set("ObjectAttributeUpdateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAttributeUpdateValue: Self = this.set("ObjectAttributeUpdateValue", js.undefined)
  }
}
