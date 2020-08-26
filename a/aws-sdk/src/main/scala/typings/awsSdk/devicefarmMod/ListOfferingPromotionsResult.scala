package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingPromotionsResult extends js.Object {
  /**
    * An identifier to be used in the next call to this operation, to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the offering promotions.
    */
  var offeringPromotions: js.UndefOr[OfferingPromotions] = js.native
}

object ListOfferingPromotionsResult {
  @scala.inline
  def apply(): ListOfferingPromotionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingPromotionsResult]
  }
  @scala.inline
  implicit class ListOfferingPromotionsResultOps[Self <: ListOfferingPromotionsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOfferingPromotionsVarargs(value: OfferingPromotion*): Self = this.set("offeringPromotions", js.Array(value :_*))
    @scala.inline
    def setOfferingPromotions(value: OfferingPromotions): Self = this.set("offeringPromotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingPromotions: Self = this.set("offeringPromotions", js.undefined)
  }
  
}

