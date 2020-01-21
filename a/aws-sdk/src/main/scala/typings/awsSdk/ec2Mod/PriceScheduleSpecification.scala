package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceScheduleSpecification extends js.Object {
  /**
    * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The fixed price for the term.
    */
  var Price: js.UndefOr[Double] = js.native
  /**
    * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
    */
  var Term: js.UndefOr[Long] = js.native
}

object PriceScheduleSpecification {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Price: Int | scala.Double = null,
    Term: Int | scala.Double = null
  ): PriceScheduleSpecification = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Price != null) __obj.updateDynamic("Price")(Price.asInstanceOf[js.Any])
    if (Term != null) __obj.updateDynamic("Term")(Term.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceScheduleSpecification]
  }
}

