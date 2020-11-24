package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAttributeUpdate extends js.Object {
  
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectAttributeAction] = js.native
  
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.native
}
object ObjectAttributeUpdate {
  
  @scala.inline
  def apply(): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
  
  @scala.inline
  implicit class ObjectAttributeUpdateOps[Self <: ObjectAttributeUpdate] (val x: Self) extends AnyVal {
    
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
    def setObjectAttributeAction(value: ObjectAttributeAction): Self = this.set("ObjectAttributeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAttributeAction: Self = this.set("ObjectAttributeAction", js.undefined)
    
    @scala.inline
    def setObjectAttributeKey(value: AttributeKey): Self = this.set("ObjectAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAttributeKey: Self = this.set("ObjectAttributeKey", js.undefined)
  }
}
