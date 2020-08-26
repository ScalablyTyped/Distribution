package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingStatus extends js.Object {
  /**
    * The date on which the offering is effective.
    */
  var effectiveOn: js.UndefOr[DateTime] = js.native
  /**
    * Represents the metadata of an offering status.
    */
  var offering: js.UndefOr[Offering] = js.native
  /**
    * The number of available devices in the offering.
    */
  var quantity: js.UndefOr[Integer] = js.native
  /**
    * The type specified for the offering status.
    */
  var `type`: js.UndefOr[OfferingTransactionType] = js.native
}

object OfferingStatus {
  @scala.inline
  def apply(): OfferingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingStatus]
  }
  @scala.inline
  implicit class OfferingStatusOps[Self <: OfferingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEffectiveOn(value: DateTime): Self = this.set("effectiveOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveOn: Self = this.set("effectiveOn", js.undefined)
    @scala.inline
    def setOffering(value: Offering): Self = this.set("offering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffering: Self = this.set("offering", js.undefined)
    @scala.inline
    def setQuantity(value: Integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setType(value: OfferingTransactionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

