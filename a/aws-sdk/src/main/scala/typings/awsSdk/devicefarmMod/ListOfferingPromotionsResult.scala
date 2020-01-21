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
  def apply(nextToken: PaginationToken = null, offeringPromotions: OfferingPromotions = null): ListOfferingPromotionsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (offeringPromotions != null) __obj.updateDynamic("offeringPromotions")(offeringPromotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfferingPromotionsResult]
  }
}

