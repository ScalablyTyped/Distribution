package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleRange extends js.Object {
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Double] = js.native
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Double] = js.native
}

object DoubleRange {
  @scala.inline
  def apply(From: js.UndefOr[Double] = js.undefined, To: js.UndefOr[Double] = js.undefined): DoubleRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(From)) __obj.updateDynamic("From")(From.get.asInstanceOf[js.Any])
    if (!js.isUndefined(To)) __obj.updateDynamic("To")(To.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleRange]
  }
}

