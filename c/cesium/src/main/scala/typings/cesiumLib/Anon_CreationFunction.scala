package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreationFunction extends js.Object {
  var creationFunction: cesiumLib.cesiumMod.CesiumNs.ProviderViewModelNs.CreationFunction | cesiumLib.cesiumMod.CesiumNs.Command
  var iconUrl: java.lang.String
  var name: java.lang.String
  var tooltip: java.lang.String
}

object Anon_CreationFunction {
  @scala.inline
  def apply(
    creationFunction: cesiumLib.cesiumMod.CesiumNs.ProviderViewModelNs.CreationFunction | cesiumLib.cesiumMod.CesiumNs.Command,
    iconUrl: java.lang.String,
    name: java.lang.String,
    tooltip: java.lang.String
  ): Anon_CreationFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creationFunction")(creationFunction.asInstanceOf[js.Any])
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Anon_CreationFunction]
  }
}

