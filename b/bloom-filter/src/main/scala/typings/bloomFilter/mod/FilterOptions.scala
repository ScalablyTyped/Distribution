package typings.bloomFilter.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  var nFlags: js.UndefOr[Double] = js.undefined
  var nHashFuncs: Double
  var nTweak: js.UndefOr[Double] = js.undefined
  var vData: Buffer
}

object FilterOptions {
  @scala.inline
  def apply(
    nHashFuncs: Double,
    vData: Buffer,
    nFlags: js.UndefOr[Double] = js.undefined,
    nTweak: js.UndefOr[Double] = js.undefined
  ): FilterOptions = {
    val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
    if (!js.isUndefined(nFlags)) __obj.updateDynamic("nFlags")(nFlags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nTweak)) __obj.updateDynamic("nTweak")(nTweak.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

