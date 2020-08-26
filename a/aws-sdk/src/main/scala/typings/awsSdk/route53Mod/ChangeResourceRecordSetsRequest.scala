package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeResourceRecordSetsRequest extends js.Object {
  /**
    * A complex type that contains an optional comment and the Changes element.
    */
  var ChangeBatch: typings.awsSdk.route53Mod.ChangeBatch = js.native
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to change.
    */
  var HostedZoneId: ResourceId = js.native
}

object ChangeResourceRecordSetsRequest {
  @scala.inline
  def apply(ChangeBatch: ChangeBatch, HostedZoneId: ResourceId): ChangeResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
  }
  @scala.inline
  implicit class ChangeResourceRecordSetsRequestOps[Self <: ChangeResourceRecordSetsRequest] (val x: Self) extends AnyVal {
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
    def setChangeBatch(value: ChangeBatch): Self = this.set("ChangeBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
  }
  
}

