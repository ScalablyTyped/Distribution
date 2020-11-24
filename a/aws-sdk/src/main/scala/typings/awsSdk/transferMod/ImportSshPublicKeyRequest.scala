package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSshPublicKeyRequest extends js.Object {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typings.awsSdk.transferMod.SshPublicKeyBody = js.native
  
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}
object ImportSshPublicKeyRequest {
  
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
  
  @scala.inline
  implicit class ImportSshPublicKeyRequestOps[Self <: ImportSshPublicKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyBody(value: SshPublicKeyBody): Self = this.set("SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
