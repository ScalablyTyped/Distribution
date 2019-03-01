package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLayoutOptions extends js.Object {
  var padding: js.UndefOr[ChartLayoutPaddingObject | scala.Double] = js.undefined
}

object ChartLayoutOptions {
  @scala.inline
  def apply(padding: ChartLayoutPaddingObject | scala.Double = null): ChartLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLayoutOptions]
  }
}

