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
  def apply(nHashFuncs: Double, vData: Buffer, nFlags: Int | Double = null, nTweak: Int | Double = null): FilterOptions = {
    val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
    if (nFlags != null) __obj.updateDynamic("nFlags")(nFlags.asInstanceOf[js.Any])
    if (nTweak != null) __obj.updateDynamic("nTweak")(nTweak.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

