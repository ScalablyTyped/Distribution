package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    FileSystemId: FileSystemId,
    Policy: Policy,
    BypassPolicyLockoutSafetyCheck: js.UndefOr[BypassPolicyLockoutSafetyCheck] = js.undefined
  ): PutFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    if (!js.isUndefined(BypassPolicyLockoutSafetyCheck)) __obj.updateDynamic("BypassPolicyLockoutSafetyCheck")(BypassPolicyLockoutSafetyCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileSystemPolicyRequest]
  }
}

