package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLayoutOptions extends js.Object {
  var padding: js.UndefOr[ChartLayoutPaddingObject | Double] = js.undefined
}

object ChartLayoutOptions {
  @scala.inline
  def apply(padding: ChartLayoutPaddingObject | Double = null): ChartLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLayoutOptions]
  }
}

