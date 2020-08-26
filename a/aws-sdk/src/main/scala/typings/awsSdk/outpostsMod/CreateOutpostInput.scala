package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOutpostInput extends js.Object {
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.native
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  var Description: js.UndefOr[OutpostDescription] = js.native
  var Name: js.UndefOr[OutpostName] = js.native
  var SiteId: typings.awsSdk.outpostsMod.SiteId = js.native
}

object CreateOutpostInput {
  @scala.inline
  def apply(SiteId: SiteId): CreateOutpostInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutpostInput]
  }
  @scala.inline
  implicit class CreateOutpostInputOps[Self <: CreateOutpostInput] (val x: Self) extends AnyVal {
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
    def setSiteId(value: SiteId): Self = this.set("SiteId", value.asInstanceOf[js.Any])
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
    def setName(value: OutpostName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

