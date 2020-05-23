package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummarizedCounter extends js.Object {
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.native
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.native
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.native
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.native
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.native
}

object SummarizedCounter {
  @scala.inline
  def apply(
    Average: js.UndefOr[Double] = js.undefined,
    Max: js.UndefOr[Double] = js.undefined,
    N: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    Sum: js.UndefOr[Double] = js.undefined,
    Unit: String = null
  ): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Average)) __obj.updateDynamic("Average")(Average.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Max)) __obj.updateDynamic("Max")(Max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(N)) __obj.updateDynamic("N")(N.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Sum)) __obj.updateDynamic("Sum")(Sum.get.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummarizedCounter]
  }
}

