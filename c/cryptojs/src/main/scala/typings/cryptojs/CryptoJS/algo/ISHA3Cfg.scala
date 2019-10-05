package typings.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISHA3Cfg extends js.Object {
  var outputLength: js.UndefOr[Double] = js.undefined
}

object ISHA3Cfg {
  @scala.inline
  def apply(outputLength: Int | Double = null): ISHA3Cfg = {
    val __obj = js.Dynamic.literal()
    if (outputLength != null) __obj.updateDynamic("outputLength")(outputLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISHA3Cfg]
  }
}

