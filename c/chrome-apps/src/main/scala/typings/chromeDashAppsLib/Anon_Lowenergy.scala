package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lowenergy extends js.Object {
  var low_energy: js.UndefOr[scala.Boolean] = js.undefined
  var peripheral: js.UndefOr[scala.Boolean] = js.undefined
  var socket: js.UndefOr[scala.Boolean] = js.undefined
  var uuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Lowenergy {
  @scala.inline
  def apply(
    low_energy: js.UndefOr[scala.Boolean] = js.undefined,
    peripheral: js.UndefOr[scala.Boolean] = js.undefined,
    socket: js.UndefOr[scala.Boolean] = js.undefined,
    uuids: js.Array[java.lang.String] = null
  ): Anon_Lowenergy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(low_energy)) __obj.updateDynamic("low_energy")(low_energy)
    if (!js.isUndefined(peripheral)) __obj.updateDynamic("peripheral")(peripheral)
    if (!js.isUndefined(socket)) __obj.updateDynamic("socket")(socket)
    if (uuids != null) __obj.updateDynamic("uuids")(uuids)
    __obj.asInstanceOf[Anon_Lowenergy]
  }
}

