package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramEntry extends js.Object {
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.native
}

object HistogramEntry {
  @scala.inline
  def apply(Count: js.UndefOr[Integer] = js.undefined, Value: js.UndefOr[Double] = js.undefined): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramEntry]
  }
}

