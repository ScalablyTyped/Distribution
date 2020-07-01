package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainPermissionsPolicyResult extends js.Object {
  /**
    *  Information about the deleted resource policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}

object DeleteDomainPermissionsPolicyResult {
  @scala.inline
  def apply(policy: ResourcePolicy = null): DeleteDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyResult]
  }
}

