package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outpost extends js.Object {
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.native
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  var Description: js.UndefOr[OutpostDescription] = js.native
  var LifeCycleStatus: js.UndefOr[typings.awsSdk.outpostsMod.LifeCycleStatus] = js.native
  var Name: js.UndefOr[OutpostName] = js.native
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.native
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.native
  var OwnerId: js.UndefOr[typings.awsSdk.outpostsMod.OwnerId] = js.native
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.native
}

object Outpost {
  @scala.inline
  def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  @scala.inline
  implicit class OutpostOps[Self <: Outpost] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: AvailabilityZone): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setAvailabilityZoneId(value: AvailabilityZoneId): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    @scala.inline
    def setDescription(value: OutpostDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLifeCycleStatus(value: LifeCycleStatus): Self = this.set("LifeCycleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifeCycleStatus: Self = this.set("LifeCycleStatus", js.undefined)
    @scala.inline
    def setName(value: OutpostName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutpostArn(value: OutpostArn): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
    @scala.inline
    def setOwnerId(value: OwnerId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setSiteId(value: SiteId): Self = this.set("SiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("SiteId", js.undefined)
  }
  
}

