package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCachePolicyRequest extends js.Object {
  /**
    * The unique identifier for the cache policy that you are deleting. To get the identifier, you can use ListCachePolicies.
    */
  var Id: String = js.native
  /**
    * The version of the cache policy that you are deleting. The version is the cache policy’s ETag value, which you can get using ListCachePolicies, GetCachePolicy, or GetCachePolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeleteCachePolicyRequest {
  @scala.inline
  def apply(Id: String): DeleteCachePolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCachePolicyRequest]
  }
  @scala.inline
  implicit class DeleteCachePolicyRequestOps[Self <: DeleteCachePolicyRequest] (val x: Self) extends AnyVal {
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

