package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDomainPermissionsPolicyResult extends js.Object {
  /**
    *  The resource policy that was set after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}

object PutDomainPermissionsPolicyResult {
  @scala.inline
  def apply(policy: ResourcePolicy = null): PutDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDomainPermissionsPolicyResult]
  }
}

