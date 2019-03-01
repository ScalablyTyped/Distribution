package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISHA3Cfg extends js.Object {
  var outputLength: js.UndefOr[scala.Double] = js.undefined
}

object ISHA3Cfg {
  @scala.inline
  def apply(outputLength: scala.Int | scala.Double = null): ISHA3Cfg = {
    val __obj = js.Dynamic.literal()
    if (outputLength != null) __obj.updateDynamic("outputLength")(outputLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISHA3Cfg]
  }
}

