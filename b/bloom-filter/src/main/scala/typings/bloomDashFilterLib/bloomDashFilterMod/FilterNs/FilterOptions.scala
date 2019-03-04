package typings
package bloomDashFilterLib.bloomDashFilterMod.FilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  var nFlags: js.UndefOr[scala.Double] = js.undefined
  var nHashFuncs: scala.Double
  var nTweak: js.UndefOr[scala.Double] = js.undefined
  var vData: nodeLib.Buffer
}

object FilterOptions {
  @scala.inline
  def apply(
    nHashFuncs: scala.Double,
    vData: nodeLib.Buffer,
    nFlags: scala.Int | scala.Double = null,
    nTweak: scala.Int | scala.Double = null
  ): FilterOptions = {
    val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs, vData = vData)
    if (nFlags != null) __obj.updateDynamic("nFlags")(nFlags.asInstanceOf[js.Any])
    if (nTweak != null) __obj.updateDynamic("nTweak")(nTweak.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

