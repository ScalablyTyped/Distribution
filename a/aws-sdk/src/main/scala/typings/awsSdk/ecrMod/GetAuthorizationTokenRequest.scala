package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenRequest extends js.Object {
  /**
    * A list of AWS account IDs that are associated with the registries for which to get AuthorizationData objects. If you do not specify a registry, the default registry is assumed.
    */
  var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.native
}

object GetAuthorizationTokenRequest {
  @scala.inline
  def apply(): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  @scala.inline
  implicit class GetAuthorizationTokenRequestOps[Self <: GetAuthorizationTokenRequest] (val x: Self) extends AnyVal {
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
    def setRegistryIdsVarargs(value: RegistryId*): Self = this.set("registryIds", js.Array(value :_*))
    @scala.inline
    def setRegistryIds(value: GetAuthorizationTokenRegistryIdList): Self = this.set("registryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryIds: Self = this.set("registryIds", js.undefined)
  }
  
}

