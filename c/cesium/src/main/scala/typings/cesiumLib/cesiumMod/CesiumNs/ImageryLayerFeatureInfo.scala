package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerFeatureInfo extends js.Object {
  var data: js.Any
  var description: java.lang.String
  var name: java.lang.String
  var position: Cartographic
  def configureDescriptionFromProperties(properties: js.Any): scala.Unit
  def configureNameFromProperties(properties: js.Any): scala.Unit
}

object ImageryLayerFeatureInfo {
  @scala.inline
  def apply(
    configureDescriptionFromProperties: js.Any => scala.Unit,
    configureNameFromProperties: js.Any => scala.Unit,
    data: js.Any,
    description: java.lang.String,
    name: java.lang.String,
    position: Cartographic
  ): ImageryLayerFeatureInfo = {
    val __obj = js.Dynamic.literal(configureDescriptionFromProperties = js.Any.fromFunction1(configureDescriptionFromProperties), configureNameFromProperties = js.Any.fromFunction1(configureNameFromProperties), data = data, description = description, name = name, position = position)
  
    __obj.asInstanceOf[ImageryLayerFeatureInfo]
  }
}

