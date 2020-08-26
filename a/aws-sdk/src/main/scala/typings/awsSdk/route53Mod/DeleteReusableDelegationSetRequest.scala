package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReusableDelegationSetRequest extends js.Object {
  /**
    * The ID of the reusable delegation set that you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteReusableDelegationSetRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReusableDelegationSetRequest]
  }
  @scala.inline
  implicit class DeleteReusableDelegationSetRequestOps[Self <: DeleteReusableDelegationSetRequest] (val x: Self) extends AnyVal {
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
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

