package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryPermissionsPolicyResult extends js.Object {
  /**
    *  The returned resource policy. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}

object GetRepositoryPermissionsPolicyResult {
  @scala.inline
  def apply(policy: ResourcePolicy = null): GetRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryPermissionsPolicyResult]
  }
}

