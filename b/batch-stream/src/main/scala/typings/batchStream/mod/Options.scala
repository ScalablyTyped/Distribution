package typings.batchStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(highWaterMark: js.UndefOr[Double] = js.undefined, size: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

