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
  def apply(Policy: string): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  @scala.inline
  implicit class PutResourcePolicyRequestOps[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: string): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    @scala.inline
    def setRevisionId(value: string): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
  }
  
}

