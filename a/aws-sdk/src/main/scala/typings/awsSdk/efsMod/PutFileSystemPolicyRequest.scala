package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutFileSystemPolicyRequest extends js.Object {
  
  /**
    * (Optional) A flag to indicate whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. The default value is False. 
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[typings.awsSdk.efsMod.BypassPolicyLockoutSafetyCheck] = js.native
  
  /**
    * The ID of the EFS file system that you want to create or update the FileSystemPolicy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  
  /**
    * The FileSystemPolicy that you're creating. Accepts a JSON formatted policy definition. To find out more about the elements that make up a file system policy, see EFS Resource-based Policies. 
    */
  var Policy: typings.awsSdk.efsMod.Policy = js.native
}
object PutFileSystemPolicyRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId, Policy: Policy): PutFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileSystemPolicyRequest]
  }
  
  @scala.inline
  implicit class PutFileSystemPolicyRequestOps[Self <: PutFileSystemPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassPolicyLockoutSafetyCheck(value: BypassPolicyLockoutSafetyCheck): Self = this.set("BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassPolicyLockoutSafetyCheck: Self = this.set("BypassPolicyLockoutSafetyCheck", js.undefined)
  }
}
