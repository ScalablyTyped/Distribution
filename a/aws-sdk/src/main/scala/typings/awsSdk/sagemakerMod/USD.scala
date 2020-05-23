package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USD extends js.Object {
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typings.awsSdk.sagemakerMod.Cents] = js.native
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typings.awsSdk.sagemakerMod.Dollars] = js.native
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typings.awsSdk.sagemakerMod.TenthFractionsOfACent] = js.native
}

object USD {
  @scala.inline
  def apply(
    Cents: js.UndefOr[Cents] = js.undefined,
    Dollars: js.UndefOr[Dollars] = js.undefined,
    TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined
  ): USD = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Cents)) __obj.updateDynamic("Cents")(Cents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Dollars)) __obj.updateDynamic("Dollars")(Dollars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TenthFractionsOfACent)) __obj.updateDynamic("TenthFractionsOfACent")(TenthFractionsOfACent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[USD]
  }
}

