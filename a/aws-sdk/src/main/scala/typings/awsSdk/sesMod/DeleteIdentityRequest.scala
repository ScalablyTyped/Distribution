package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentityRequest extends js.Object {
  
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
}
object DeleteIdentityRequest {
  
  @scala.inline
  def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
  
  @scala.inline
  implicit class DeleteIdentityRequestOps[Self <: DeleteIdentityRequest] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: Identity): Self = this.set("Identity", value.asInstanceOf[js.Any])
  }
}
