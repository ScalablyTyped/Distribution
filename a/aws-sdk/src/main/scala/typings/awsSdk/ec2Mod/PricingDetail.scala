package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingDetail extends js.Object {
  /**
    * The number of reservations available for the price.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The price per instance.
    */
  var Price: js.UndefOr[Double] = js.native
}

object PricingDetail {
  @scala.inline
  def apply(Count: js.UndefOr[Integer] = js.undefined, Price: js.UndefOr[Double] = js.undefined): PricingDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Price)) __obj.updateDynamic("Price")(Price.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingDetail]
  }
}

