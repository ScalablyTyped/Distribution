package typings.cesium

import typings.cesium.mod.Entity
import typings.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntity extends js.Object {
  var entity: Entity
  var geometryOptions: js.Any
  var geometryPropertyName: String
  var observedPropertyNames: js.Array[String]
  var scene: Scene
}

object AnonEntity {
  @scala.inline
  def apply(
    entity: Entity,
    geometryOptions: js.Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: Scene
  ): AnonEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntity]
  }
}

