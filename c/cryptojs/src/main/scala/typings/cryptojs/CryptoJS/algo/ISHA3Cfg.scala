package typings.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISHA3Cfg extends js.Object {
  var outputLength: js.UndefOr[Double] = js.undefined
}

object ISHA3Cfg {
  @scala.inline
  def apply(outputLength: js.UndefOr[Double] = js.undefined): ISHA3Cfg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputLength)) __obj.updateDynamic("outputLength")(outputLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISHA3Cfg]
  }
}

