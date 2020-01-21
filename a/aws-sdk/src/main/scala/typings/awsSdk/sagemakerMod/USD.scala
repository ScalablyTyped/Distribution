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
    Cents: Int | Double = null,
    Dollars: Int | Double = null,
    TenthFractionsOfACent: Int | Double = null
  ): USD = {
    val __obj = js.Dynamic.literal()
    if (Cents != null) __obj.updateDynamic("Cents")(Cents.asInstanceOf[js.Any])
    if (Dollars != null) __obj.updateDynamic("Dollars")(Dollars.asInstanceOf[js.Any])
    if (TenthFractionsOfACent != null) __obj.updateDynamic("TenthFractionsOfACent")(TenthFractionsOfACent.asInstanceOf[js.Any])
    __obj.asInstanceOf[USD]
  }
}

