package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyRequest extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
}

object DeleteResourcePolicyRequest {
  @scala.inline
  def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  @scala.inline
  implicit class DeleteResourcePolicyRequestOps[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
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
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
  }
  
}

