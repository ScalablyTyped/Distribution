package typings
package caseDashSensitiveDashPathsDashWebpackDashPluginLib.caseDashSensitiveDashPathsDashWebpackDashPluginMod.CaseSensitivePathsWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Show more information
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(debug: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Options]
  }
}

