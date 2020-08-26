package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteHostedZoneRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedZoneRequest]
  }
  @scala.inline
  implicit class DeleteHostedZoneRequestOps[Self <: DeleteHostedZoneRequest] (val x: Self) extends AnyVal {
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

