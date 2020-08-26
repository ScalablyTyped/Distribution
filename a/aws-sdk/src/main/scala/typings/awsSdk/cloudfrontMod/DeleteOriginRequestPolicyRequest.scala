package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOriginRequestPolicyRequest extends js.Object {
  /**
    * The unique identifier for the origin request policy that you are deleting. To get the identifier, you can use ListOriginRequestPolicies.
    */
  var Id: String = js.native
  /**
    * The version of the origin request policy that you are deleting. The version is the origin request policy’s ETag value, which you can get using ListOriginRequestPolicies, GetOriginRequestPolicy, or GetOriginRequestPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeleteOriginRequestPolicyRequest {
  @scala.inline
  def apply(Id: String): DeleteOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginRequestPolicyRequest]
  }
  @scala.inline
  implicit class DeleteOriginRequestPolicyRequestOps[Self <: DeleteOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

