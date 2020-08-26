package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainMetadataRequest extends js.Object {
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.worklinkMod.DomainName = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object UpdateDomainMetadataRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): UpdateDomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainMetadataRequest]
  }
  @scala.inline
  implicit class UpdateDomainMetadataRequestOps[Self <: UpdateDomainMetadataRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
  }
  
}

