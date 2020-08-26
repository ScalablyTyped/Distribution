package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedCapacityDescription extends js.Object {
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var CapacityId: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
    */
  var StartDate: js.UndefOr[String] = js.native
}

object ProvisionedCapacityDescription {
  @scala.inline
  def apply(): ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedCapacityDescription]
  }
  @scala.inline
  implicit class ProvisionedCapacityDescriptionOps[Self <: ProvisionedCapacityDescription] (val x: Self) extends AnyVal {
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
    def setCapacityId(value: String): Self = this.set("CapacityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityId: Self = this.set("CapacityId", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
  }
  
}

