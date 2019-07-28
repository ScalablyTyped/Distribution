package typings.cesium

import typings.cesium.cesiumMod.Command
import typings.cesium.cesiumMod.ProviderViewModelNs.CreationFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreationFunction extends js.Object {
  var creationFunction: CreationFunction | Command
  var iconUrl: String
  var name: String
  var tooltip: String
}

object Anon_CreationFunction {
  @scala.inline
  def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): Anon_CreationFunction = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl, name = name, tooltip = tooltip)
  
    __obj.asInstanceOf[Anon_CreationFunction]
  }
}

