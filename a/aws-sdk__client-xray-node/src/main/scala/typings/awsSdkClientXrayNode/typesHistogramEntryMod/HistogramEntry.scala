package typings.awsSdkClientXrayNode.typesHistogramEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramEntry extends js.Object {
  /**
    * <p>The prevalence of the entry.</p>
    */
  var Count: js.UndefOr[Double] = js.undefined
  /**
    * <p>The value of the entry.</p>
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object HistogramEntry {
  @scala.inline
  def apply(Count: js.UndefOr[Double] = js.undefined, Value: js.UndefOr[Double] = js.undefined): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramEntry]
  }
}

