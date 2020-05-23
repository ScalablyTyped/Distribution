package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyRequest extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
}

object GetResourcePolicyRequest {
  @scala.inline
  def apply(RegistryName: string = null): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (RegistryName != null) __obj.updateDynamic("RegistryName")(RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
}

