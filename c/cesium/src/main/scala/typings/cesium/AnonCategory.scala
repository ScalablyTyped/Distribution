package typings.cesium

import typings.cesium.mod.Command
import typings.cesium.mod.ProviderViewModel.CreationFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var creationFunction: CreationFunction | Command
  var iconUrl: String
  var name: String
  var tooltip: String
}

object AnonCategory {
  @scala.inline
  def apply(
    creationFunction: CreationFunction | Command,
    iconUrl: String,
    name: String,
    tooltip: String,
    category: String = null
  ): AnonCategory = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

