package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOriginRequestPolicyConfigRequest extends js.Object {
  /**
    * The unique identifier for the origin request policy. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  var Id: String = js.native
}

object GetOriginRequestPolicyConfigRequest {
  @scala.inline
  def apply(Id: String): GetOriginRequestPolicyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginRequestPolicyConfigRequest]
  }
  @scala.inline
  implicit class GetOriginRequestPolicyConfigRequestOps[Self <: GetOriginRequestPolicyConfigRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

