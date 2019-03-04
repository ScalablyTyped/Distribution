package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderViewModel extends js.Object {
  var creationCommand: Command
  var iconUrl: java.lang.String
  var name: java.lang.String
  var tooltip: java.lang.String
}

object ProviderViewModel {
  @scala.inline
  def apply(
    creationCommand: Command,
    iconUrl: java.lang.String,
    name: java.lang.String,
    tooltip: java.lang.String
  ): ProviderViewModel = {
    val __obj = js.Dynamic.literal(creationCommand = creationCommand, iconUrl = iconUrl, name = name, tooltip = tooltip)
  
    __obj.asInstanceOf[ProviderViewModel]
  }
}

