package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingPromotion extends js.Object {
  /**
    * A string that describes the offering promotion.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The ID of the offering promotion.
    */
  var id: js.UndefOr[OfferingPromotionIdentifier] = js.native
}

object OfferingPromotion {
  @scala.inline
  def apply(): OfferingPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingPromotion]
  }
  @scala.inline
  implicit class OfferingPromotionOps[Self <: OfferingPromotion] (val x: Self) extends AnyVal {
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
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: OfferingPromotionIdentifier): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

