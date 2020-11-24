package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResourceShareRequest extends js.Object {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String = js.native
}
object AssociateResourceShareRequest {
  
  @scala.inline
  def apply(resourceShareArn: String): AssociateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceShareRequest]
  }
  
  @scala.inline
  implicit class AssociateResourceShareRequestOps[Self <: AssociateResourceShareRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = this.set("principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: PrincipalArnOrIdList): Self = this.set("principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
    
    @scala.inline
    def setResourceArnsVarargs(value: String*): Self = this.set("resourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArns: Self = this.set("resourceArns", js.undefined)
  }
}
