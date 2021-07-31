package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFileSystemPolicyRequest extends StObject {
  
  /**
    * (Optional) A flag to indicate whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. The default value is False. 
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[typings.awsSdk.efsMod.BypassPolicyLockoutSafetyCheck] = js.undefined
  
  /**
    * The ID of the EFS file system that you want to create or update the FileSystemPolicy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
  
  /**
    * The FileSystemPolicy that you're creating. Accepts a JSON formatted policy definition. To find out more about the elements that make up a file system policy, see EFS Resource-based Policies. 
    */
  var Policy: typings.awsSdk.efsMod.Policy
}
object PutFileSystemPolicyRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId, Policy: Policy): PutFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileSystemPolicyRequest]
  }
  
  @scala.inline
  implicit class PutFileSystemPolicyRequestMutableBuilder[Self <: PutFileSystemPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassPolicyLockoutSafetyCheck(value: BypassPolicyLockoutSafetyCheck): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
