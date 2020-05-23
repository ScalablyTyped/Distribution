package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyRequest extends js.Object {
  /**
    * The resource-based policy.
    */
  var Policy: string = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * The revision ID of the policy.
    */
  var RevisionId: js.UndefOr[string] = js.native
}

object PutResourcePolicyRequest {
  @scala.inline
  def apply(Policy: string, RegistryName: string = null, RevisionId: string = null): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    if (RegistryName != null) __obj.updateDynamic("RegistryName")(RegistryName.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
}

