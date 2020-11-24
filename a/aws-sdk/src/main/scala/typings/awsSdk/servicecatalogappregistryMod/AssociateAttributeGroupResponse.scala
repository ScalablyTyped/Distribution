package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateAttributeGroupResponse extends js.Object {
  
  /**
    * The Amazon resource name (ARN) of the application that was augmented with attributes.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.native
  
  /**
    * The Amazon resource name (ARN) of the attribute group that contains the application's new attributes.
    */
  var attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.native
}
object AssociateAttributeGroupResponse {
  
  @scala.inline
  def apply(): AssociateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class AssociateAttributeGroupResponseOps[Self <: AssociateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationArn(value: ApplicationArn): Self = this.set("applicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationArn: Self = this.set("applicationArn", js.undefined)
    
    @scala.inline
    def setAttributeGroupArn(value: AttributeGroupArn): Self = this.set("attributeGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeGroupArn: Self = this.set("attributeGroupArn", js.undefined)
  }
}
