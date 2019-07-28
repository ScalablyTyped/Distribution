package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lowenergy extends js.Object {
  var low_energy: js.UndefOr[Boolean] = js.undefined
  var peripheral: js.UndefOr[Boolean] = js.undefined
  var socket: js.UndefOr[Boolean] = js.undefined
  var uuids: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Lowenergy {
  @scala.inline
  def apply(
    low_energy: js.UndefOr[Boolean] = js.undefined,
    peripheral: js.UndefOr[Boolean] = js.undefined,
    socket: js.UndefOr[Boolean] = js.undefined,
    uuids: js.Array[String] = null
  ): Anon_Lowenergy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(low_energy)) __obj.updateDynamic("low_energy")(low_energy)
    if (!js.isUndefined(peripheral)) __obj.updateDynamic("peripheral")(peripheral)
    if (!js.isUndefined(socket)) __obj.updateDynamic("socket")(socket)
    if (uuids != null) __obj.updateDynamic("uuids")(uuids)
    __obj.asInstanceOf[Anon_Lowenergy]
  }
}

