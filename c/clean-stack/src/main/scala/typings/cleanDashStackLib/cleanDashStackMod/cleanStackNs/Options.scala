package typings
package cleanDashStackLib.cleanDashStackMod.cleanStackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(pretty: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    __obj.asInstanceOf[Options]
  }
}

