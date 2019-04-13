package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreationFunction extends js.Object {
  var creationFunction: cesiumLib.cesiumMod.ProviderViewModelNs.CreationFunction | cesiumLib.cesiumMod.Command
  var iconUrl: java.lang.String
  var name: java.lang.String
  var tooltip: java.lang.String
}

object Anon_CreationFunction {
  @scala.inline
  def apply(
    creationFunction: cesiumLib.cesiumMod.ProviderViewModelNs.CreationFunction | cesiumLib.cesiumMod.Command,
    iconUrl: java.lang.String,
    name: java.lang.String,
    tooltip: java.lang.String
  ): Anon_CreationFunction = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl, name = name, tooltip = tooltip)
  
    __obj.asInstanceOf[Anon_CreationFunction]
  }
}

