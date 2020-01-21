package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnablePolicyTypeRequest extends js.Object {
  /**
    * The policy type that you want to enable.
    */
  var PolicyType: typings.awsSdk.organizationsMod.PolicyType = js.native
  /**
    * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lowercase letters or digits.
    */
  var RootId: typings.awsSdk.organizationsMod.RootId = js.native
}

object EnablePolicyTypeRequest {
  @scala.inline
  def apply(PolicyType: PolicyType, RootId: RootId): EnablePolicyTypeRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any], RootId = RootId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnablePolicyTypeRequest]
  }
}

