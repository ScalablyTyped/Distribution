package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedLinkFacetAttributeUpdate extends js.Object {
  
  /**
    * The action to perform when updating the attribute.
    */
  var Action: UpdateActionType = js.native
  
  /**
    * The attribute to update.
    */
  var Attribute: TypedLinkAttributeDefinition = js.native
}
object TypedLinkFacetAttributeUpdate {
  
  @scala.inline
  def apply(Action: UpdateActionType, Attribute: TypedLinkAttributeDefinition): TypedLinkFacetAttributeUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
  }
  
  @scala.inline
  implicit class TypedLinkFacetAttributeUpdateOps[Self <: TypedLinkFacetAttributeUpdate] (val x: Self) extends AnyVal {
    
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
    def setAction(value: UpdateActionType): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: TypedLinkAttributeDefinition): Self = this.set("Attribute", value.asInstanceOf[js.Any])
  }
}
